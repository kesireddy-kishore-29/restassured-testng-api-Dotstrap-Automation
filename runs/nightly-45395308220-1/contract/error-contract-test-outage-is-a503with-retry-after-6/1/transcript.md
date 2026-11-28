# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-568a3c22-e65d-42f9-9d77-f6b704df9097` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-e32e0f3d-93e3-4be2-868f-63b1d301ba90` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-0e9bd40c-941e-4795-aba5-a7074faa64e4` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-6d9ddb2a-591d-47f2-93c4-e93c49c6a0db` |
| 5 | `POST /v1/conversations` | 503 | 10 | `qa-0b65dc5e-967a-4c01-8627-bb962ba6445c` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-233d2ece-057a-46b1-94d2-8d58703e123d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a913d829-734e-44bf-8dff-f65d2dda048b` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-0d18b990-f7cf-4404-8d57-633677784f7b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-15b13065-78f3-4fb8-840a-f3cffb7c0d88` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-687658b5-d9a1-46ba-a640-c1ba0a5eb9be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-568a3c22-e65d-42f9-9d77-f6b704df9097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-568a3c22-e65d-42f9-9d77-f6b704df9097
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba64e053e95","displayName":"QA 5ba64e053e95","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-568a3c22-e65d-42f9-9d77-f6b704df9097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-5ba64e053e95
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed954c7f-4963-43aa-bb88-a02f812a73b6","handle":"qa-5ba64e053e95","displayName":"QA 5ba64e053e95","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.561775773Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e32e0f3d-93e3-4be2-868f-63b1d301ba90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e32e0f3d-93e3-4be2-868f-63b1d301ba90
Content-Type: application/json

--- request body ---
{"handle":"qa-79f885f69a0e","displayName":"QA 79f885f69a0e","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e32e0f3d-93e3-4be2-868f-63b1d301ba90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-79f885f69a0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_108d7645-006e-4b7b-94a4-4743baccaaa1","handle":"qa-79f885f69a0e","displayName":"QA 79f885f69a0e","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.617721217Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e9bd40c-941e-4795-aba5-a7074faa64e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e9bd40c-941e-4795-aba5-a7074faa64e4
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba64e053e95","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e9bd40c-941e-4795-aba5-a7074faa64e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed954c7f-4963-43aa-bb88-a02f812a73b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6d9ddb2a-591d-47f2-93c4-e93c49c6a0db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d9ddb2a-591d-47f2-93c4-e93c49c6a0db
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-79f885f69a0e","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d9ddb2a-591d-47f2-93c4-e93c49c6a0db
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
Location: /v1/conversations/cnv_bc871df4-707d-4835-947d-68a7420bcdb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc871df4-707d-4835-947d-68a7420bcdb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ba64e053e95","qa-79f885f69a0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.684657409Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0b65dc5e-967a-4c01-8627-bb962ba6445c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9480be2a-85f5-41bb-a043-1adf563742b5
X-Correlation-Id: qa-0b65dc5e-967a-4c01-8627-bb962ba6445c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ba64e053e95","subject":"Probe","message":"Hi"}

--- response: 503 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b65dc5e-967a-4c01-8627-bb962ba6445c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-0b65dc5e-967a-4c01-8627-bb962ba6445c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-233d2ece-057a-46b1-94d2-8d58703e123d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-233d2ece-057a-46b1-94d2-8d58703e123d
Content-Type: application/json

--- request body ---
{"handle":"qa-79f885f69a0e","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-233d2ece-057a-46b1-94d2-8d58703e123d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_108d7645-006e-4b7b-94a4-4743baccaaa1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a913d829-734e-44bf-8dff-f65d2dda048b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a913d829-734e-44bf-8dff-f65d2dda048b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a913d829-734e-44bf-8dff-f65d2dda048b
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
correlation: qa-0d18b990-f7cf-4404-8d57-633677784f7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d18b990-f7cf-4404-8d57-633677784f7b
Content-Type: application/json

--- request body ---
{"handle":"qa-79f885f69a0e","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d18b990-f7cf-4404-8d57-633677784f7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d18b990-f7cf-4404-8d57-633677784f7b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15b13065-78f3-4fb8-840a-f3cffb7c0d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15b13065-78f3-4fb8-840a-f3cffb7c0d88
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15b13065-78f3-4fb8-840a-f3cffb7c0d88
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
correlation: qa-687658b5-d9a1-46ba-a640-c1ba0a5eb9be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687658b5-d9a1-46ba-a640-c1ba0a5eb9be
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba64e053e95","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-687658b5-d9a1-46ba-a640-c1ba0a5eb9be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-687658b5-d9a1-46ba-a640-c1ba0a5eb9be"}
```
