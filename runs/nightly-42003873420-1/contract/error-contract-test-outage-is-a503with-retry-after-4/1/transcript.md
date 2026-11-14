# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-08707dc7-4350-4022-a83d-0b8555bc23b3` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-46ed8fe8-7288-4bdc-8e2c-544a22b1c746` |
| 3 | `POST /v1/auth/token` | 200 | 58 | `qa-1c123c50-49ef-4182-9947-ff6498e6808c` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-0caf4afb-c8e2-4e80-b8f4-608ec6b4562b` |
| 5 | `DELETE /v1/accounts/me` | 503 | 12 | `qa-564fe098-343f-4fc4-852f-21c0c059466f` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-d5ef2328-dbb7-4c6f-a4f2-841133e67edf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ab26eecc-1583-4fc4-bc31-e580099ccb60` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-4bd7a3eb-5ba6-4d1b-b017-914b56326243` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-cd7035c5-9c1a-4c17-894b-a799268b8a54` |
| 10 | `POST /v1/auth/token` | 401 | 49 | `qa-5bd352d6-a728-490a-969d-f16266932c4b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08707dc7-4350-4022-a83d-0b8555bc23b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08707dc7-4350-4022-a83d-0b8555bc23b3
Content-Type: application/json

--- request body ---
{"handle":"qa-e094e4b058f4","displayName":"QA e094e4b058f4","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-08707dc7-4350-4022-a83d-0b8555bc23b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-e094e4b058f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fdf646d8-a136-4f11-91a3-30c4c5b1d355","handle":"qa-e094e4b058f4","displayName":"QA e094e4b058f4","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.472648610Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-46ed8fe8-7288-4bdc-8e2c-544a22b1c746

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46ed8fe8-7288-4bdc-8e2c-544a22b1c746
Content-Type: application/json

--- request body ---
{"handle":"qa-2f8b1429273b","displayName":"QA 2f8b1429273b","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-46ed8fe8-7288-4bdc-8e2c-544a22b1c746
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f8b1429273b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ae95c92-2887-44b2-8c89-bb49db0d9310","handle":"qa-2f8b1429273b","displayName":"QA 2f8b1429273b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.520583815Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c123c50-49ef-4182-9947-ff6498e6808c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c123c50-49ef-4182-9947-ff6498e6808c
Content-Type: application/json

--- request body ---
{"handle":"qa-e094e4b058f4","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c123c50-49ef-4182-9947-ff6498e6808c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf646d8-a136-4f11-91a3-30c4c5b1d355"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0caf4afb-c8e2-4e80-b8f4-608ec6b4562b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0caf4afb-c8e2-4e80-b8f4-608ec6b4562b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2f8b1429273b","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-0caf4afb-c8e2-4e80-b8f4-608ec6b4562b
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
Location: /v1/conversations/cnv_821a203b-1243-444e-adeb-5ee7e00734c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_821a203b-1243-444e-adeb-5ee7e00734c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-e094e4b058f4","qa-2f8b1429273b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.655096178Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-564fe098-343f-4fc4-852f-21c0c059466f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8f25af0f-5b7b-4352-8ca5-093cfc5b1e01
X-Correlation-Id: qa-564fe098-343f-4fc4-852f-21c0c059466f
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-564fe098-343f-4fc4-852f-21c0c059466f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-564fe098-343f-4fc4-852f-21c0c059466f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d5ef2328-dbb7-4c6f-a4f2-841133e67edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5ef2328-dbb7-4c6f-a4f2-841133e67edf
Content-Type: application/json

--- request body ---
{"handle":"qa-2f8b1429273b","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5ef2328-dbb7-4c6f-a4f2-841133e67edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ae95c92-2887-44b2-8c89-bb49db0d9310"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab26eecc-1583-4fc4-bc31-e580099ccb60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab26eecc-1583-4fc4-bc31-e580099ccb60
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab26eecc-1583-4fc4-bc31-e580099ccb60
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
correlation: qa-4bd7a3eb-5ba6-4d1b-b017-914b56326243

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bd7a3eb-5ba6-4d1b-b017-914b56326243
Content-Type: application/json

--- request body ---
{"handle":"qa-2f8b1429273b","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4bd7a3eb-5ba6-4d1b-b017-914b56326243
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4bd7a3eb-5ba6-4d1b-b017-914b56326243"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd7035c5-9c1a-4c17-894b-a799268b8a54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd7035c5-9c1a-4c17-894b-a799268b8a54
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd7035c5-9c1a-4c17-894b-a799268b8a54
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
correlation: qa-5bd352d6-a728-490a-969d-f16266932c4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd352d6-a728-490a-969d-f16266932c4b
Content-Type: application/json

--- request body ---
{"handle":"qa-e094e4b058f4","password":"****"}

--- response: 401 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bd352d6-a728-490a-969d-f16266932c4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bd352d6-a728-490a-969d-f16266932c4b"}
```
