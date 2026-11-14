# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-d7f1baf4-db0e-430a-9cc4-f75f06c101b8` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-cf19a39a-6c49-4221-945b-82f7858b7b78` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-7a02b533-5547-4480-9e88-767ceb89ef1d` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-0f3c6311-4d68-452c-8bcc-c07ee1f97e17` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 22 | `qa-4b2bcf45-db77-4a0c-8f19-22e442bbad56` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-0dd80e33-d6ad-4a80-9d1d-a7458b7c2b9c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c40cc444-7e9f-47a7-ab60-7df43994c220` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-e121b379-cb1f-4520-8190-e4222da3dfec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-21a50dcf-63b4-422c-9598-3f6887667c63` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-5b2c70dc-8301-4032-b8e1-29b9b2765d5b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d7f1baf4-db0e-430a-9cc4-f75f06c101b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7f1baf4-db0e-430a-9cc4-f75f06c101b8
Content-Type: application/json

--- request body ---
{"handle":"qa-d7e1965705b5","displayName":"QA d7e1965705b5","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7f1baf4-db0e-430a-9cc4-f75f06c101b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-d7e1965705b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_93bca864-32d7-4ffe-8a2d-bf7a8ff3ea59","handle":"qa-d7e1965705b5","displayName":"QA d7e1965705b5","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.937392838Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cf19a39a-6c49-4221-945b-82f7858b7b78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf19a39a-6c49-4221-945b-82f7858b7b78
Content-Type: application/json

--- request body ---
{"handle":"qa-44dfe9a1378f","displayName":"QA 44dfe9a1378f","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf19a39a-6c49-4221-945b-82f7858b7b78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-44dfe9a1378f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62036b9e-14e6-4cbe-bf2a-167e156c7883","handle":"qa-44dfe9a1378f","displayName":"QA 44dfe9a1378f","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.973313740Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7a02b533-5547-4480-9e88-767ceb89ef1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a02b533-5547-4480-9e88-767ceb89ef1d
Content-Type: application/json

--- request body ---
{"handle":"qa-d7e1965705b5","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a02b533-5547-4480-9e88-767ceb89ef1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93bca864-32d7-4ffe-8a2d-bf7a8ff3ea59"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0f3c6311-4d68-452c-8bcc-c07ee1f97e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3c6311-4d68-452c-8bcc-c07ee1f97e17
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-44dfe9a1378f","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f3c6311-4d68-452c-8bcc-c07ee1f97e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_7c0487e1-8a1b-4e7e-840b-0027c9937037
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c0487e1-8a1b-4e7e-840b-0027c9937037","subject":"Error contract","status":"open","region":"eu","participants":["qa-d7e1965705b5","qa-44dfe9a1378f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.075480878Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7c0487e1-8a1b-4e7e-840b-0027c9937037/read
correlation: qa-4b2bcf45-db77-4a0c-8f19-22e442bbad56

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fd71215f-5708-4964-9d97-cbc6b3011421
X-Correlation-Id: qa-4b2bcf45-db77-4a0c-8f19-22e442bbad56
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b2bcf45-db77-4a0c-8f19-22e442bbad56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_7c0487e1-8a1b-4e7e-840b-0027c9937037/read","correlationId":"qa-4b2bcf45-db77-4a0c-8f19-22e442bbad56"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0dd80e33-d6ad-4a80-9d1d-a7458b7c2b9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dd80e33-d6ad-4a80-9d1d-a7458b7c2b9c
Content-Type: application/json

--- request body ---
{"handle":"qa-44dfe9a1378f","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dd80e33-d6ad-4a80-9d1d-a7458b7c2b9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62036b9e-14e6-4cbe-bf2a-167e156c7883"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c40cc444-7e9f-47a7-ab60-7df43994c220

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40cc444-7e9f-47a7-ab60-7df43994c220
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c40cc444-7e9f-47a7-ab60-7df43994c220
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e121b379-cb1f-4520-8190-e4222da3dfec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e121b379-cb1f-4520-8190-e4222da3dfec
Content-Type: application/json

--- request body ---
{"handle":"qa-44dfe9a1378f","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e121b379-cb1f-4520-8190-e4222da3dfec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e121b379-cb1f-4520-8190-e4222da3dfec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21a50dcf-63b4-422c-9598-3f6887667c63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a50dcf-63b4-422c-9598-3f6887667c63
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21a50dcf-63b4-422c-9598-3f6887667c63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5b2c70dc-8301-4032-b8e1-29b9b2765d5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b2c70dc-8301-4032-b8e1-29b9b2765d5b
Content-Type: application/json

--- request body ---
{"handle":"qa-d7e1965705b5","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b2c70dc-8301-4032-b8e1-29b9b2765d5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b2c70dc-8301-4032-b8e1-29b9b2765d5b"}
```
