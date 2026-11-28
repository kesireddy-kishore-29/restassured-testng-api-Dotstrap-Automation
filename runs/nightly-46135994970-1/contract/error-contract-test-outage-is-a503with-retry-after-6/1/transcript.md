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
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-89c922d2-34b6-4555-b797-a7e0eea42c93` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-2f52c016-d6ef-460b-b2d6-d00fc7c87947` |
| 3 | `POST /v1/auth/token` | 200 | 54 | `qa-7e09daef-531d-42fa-b4d8-a893c6af8a25` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-b230b925-0f7d-4c99-8ced-554a83235f24` |
| 5 | `POST /v1/conversations` | 503 | 20 | `qa-6ff22e80-75e2-4784-9e27-82d0a9276dee` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-1d7af0cc-5c10-413d-95f7-da6f07d08782` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-525e4367-2244-497e-a177-254c087e4bc0` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-9d34e605-8ae6-42a3-9856-73a456d9cce3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-dddedcff-6a94-4b14-9346-3caa4f1fa215` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-18b81bad-0989-47a4-9f69-e0e277fa5a46` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89c922d2-34b6-4555-b797-a7e0eea42c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89c922d2-34b6-4555-b797-a7e0eea42c93
Content-Type: application/json

--- request body ---
{"handle":"qa-db8fb45bbc03","displayName":"QA db8fb45bbc03","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-89c922d2-34b6-4555-b797-a7e0eea42c93
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
Location: /v1/accounts/qa-db8fb45bbc03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a12e1c04-54aa-4591-84d2-c635d2ff5b2a","handle":"qa-db8fb45bbc03","displayName":"QA db8fb45bbc03","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.251839889Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f52c016-d6ef-460b-b2d6-d00fc7c87947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f52c016-d6ef-460b-b2d6-d00fc7c87947
Content-Type: application/json

--- request body ---
{"handle":"qa-92a32f4a0928","displayName":"QA 92a32f4a0928","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f52c016-d6ef-460b-b2d6-d00fc7c87947
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-92a32f4a0928
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b12814c-05b5-44e2-82b3-caad38dbd30a","handle":"qa-92a32f4a0928","displayName":"QA 92a32f4a0928","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.317409818Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7e09daef-531d-42fa-b4d8-a893c6af8a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e09daef-531d-42fa-b4d8-a893c6af8a25
Content-Type: application/json

--- request body ---
{"handle":"qa-db8fb45bbc03","password":"****"}

--- response: 200 in 54 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e09daef-531d-42fa-b4d8-a893c6af8a25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a12e1c04-54aa-4591-84d2-c635d2ff5b2a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b230b925-0f7d-4c99-8ced-554a83235f24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b230b925-0f7d-4c99-8ced-554a83235f24
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-92a32f4a0928","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b230b925-0f7d-4c99-8ced-554a83235f24
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
Location: /v1/conversations/cnv_b3c4aa26-fdcf-4795-b845-d091bb1bcc60
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b3c4aa26-fdcf-4795-b845-d091bb1bcc60","subject":"Error contract","status":"open","region":"eu","participants":["qa-db8fb45bbc03","qa-92a32f4a0928"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.454146332Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6ff22e80-75e2-4784-9e27-82d0a9276dee

--- request headers ---
Accept: application/json
X-Fault-Key: 35ccc5c7-4e46-4aca-8609-eac2a4d41294
X-Fault: unavailable-once
X-Correlation-Id: qa-6ff22e80-75e2-4784-9e27-82d0a9276dee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-db8fb45bbc03","subject":"Probe","message":"Hi"}

--- response: 503 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ff22e80-75e2-4784-9e27-82d0a9276dee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-6ff22e80-75e2-4784-9e27-82d0a9276dee"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1d7af0cc-5c10-413d-95f7-da6f07d08782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7af0cc-5c10-413d-95f7-da6f07d08782
Content-Type: application/json

--- request body ---
{"handle":"qa-92a32f4a0928","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7af0cc-5c10-413d-95f7-da6f07d08782
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b12814c-05b5-44e2-82b3-caad38dbd30a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-525e4367-2244-497e-a177-254c087e4bc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-525e4367-2244-497e-a177-254c087e4bc0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-525e4367-2244-497e-a177-254c087e4bc0
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
correlation: qa-9d34e605-8ae6-42a3-9856-73a456d9cce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d34e605-8ae6-42a3-9856-73a456d9cce3
Content-Type: application/json

--- request body ---
{"handle":"qa-92a32f4a0928","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d34e605-8ae6-42a3-9856-73a456d9cce3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d34e605-8ae6-42a3-9856-73a456d9cce3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dddedcff-6a94-4b14-9346-3caa4f1fa215

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dddedcff-6a94-4b14-9346-3caa4f1fa215
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dddedcff-6a94-4b14-9346-3caa4f1fa215
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
correlation: qa-18b81bad-0989-47a4-9f69-e0e277fa5a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b81bad-0989-47a4-9f69-e0e277fa5a46
Content-Type: application/json

--- request body ---
{"handle":"qa-db8fb45bbc03","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18b81bad-0989-47a4-9f69-e0e277fa5a46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18b81bad-0989-47a4-9f69-e0e277fa5a46"}
```
