# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-07a8522f-20e0-4f94-8795-7a7f089b3e07` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-10384a81-121c-4696-b811-ad4dbe611edb` |
| 3 | `POST /v1/auth/token` | 200 | 67 | `qa-3fa4f9b0-4b3b-456c-bbcd-da8214f032e7` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-5998972c-cfdf-48fc-ae63-d074a4f7a08d` |
| 5 | `POST /v1/credits/purchases` | 400 | 20 | `qa-1c724c3b-39b8-4d88-b473-a1497299137f` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-d6c9cd44-6b89-4804-8963-1ed5b6d26746` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c6cab569-dc89-4cfd-a59b-c5cd6a9d0418` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-0d0b6c8b-99e7-4fc7-8042-356425c84549` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-43efe291-38e6-48c7-887e-4fa633352003` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-b1bc4fc3-e6e7-4a30-88dc-26cdcdaa018c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07a8522f-20e0-4f94-8795-7a7f089b3e07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a8522f-20e0-4f94-8795-7a7f089b3e07
Content-Type: application/json

--- request body ---
{"handle":"qa-36de7c2a92b6","displayName":"QA 36de7c2a92b6","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-07a8522f-20e0-4f94-8795-7a7f089b3e07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Location: /v1/accounts/qa-36de7c2a92b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c68b6324-04cd-4e2f-8845-e12fa059035b","handle":"qa-36de7c2a92b6","displayName":"QA 36de7c2a92b6","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.400314289Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10384a81-121c-4696-b811-ad4dbe611edb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10384a81-121c-4696-b811-ad4dbe611edb
Content-Type: application/json

--- request body ---
{"handle":"qa-38f29f5e1ffa","displayName":"QA 38f29f5e1ffa","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-10384a81-121c-4696-b811-ad4dbe611edb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Location: /v1/accounts/qa-38f29f5e1ffa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7fbf8be-4b84-48db-b65d-a40ad5e79d2b","handle":"qa-38f29f5e1ffa","displayName":"QA 38f29f5e1ffa","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.470609196Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3fa4f9b0-4b3b-456c-bbcd-da8214f032e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fa4f9b0-4b3b-456c-bbcd-da8214f032e7
Content-Type: application/json

--- request body ---
{"handle":"qa-36de7c2a92b6","password":"****"}

--- response: 200 in 67 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fa4f9b0-4b3b-456c-bbcd-da8214f032e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c68b6324-04cd-4e2f-8845-e12fa059035b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5998972c-cfdf-48fc-ae63-d074a4f7a08d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5998972c-cfdf-48fc-ae63-d074a4f7a08d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38f29f5e1ffa","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5998972c-cfdf-48fc-ae63-d074a4f7a08d
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
Location: /v1/conversations/cnv_760424e5-0017-4b7e-a0a5-df9e44083e88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_760424e5-0017-4b7e-a0a5-df9e44083e88","subject":"Error contract","status":"open","region":"eu","participants":["qa-36de7c2a92b6","qa-38f29f5e1ffa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.582240824Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1c724c3b-39b8-4d88-b473-a1497299137f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0a16ff8dcaa3459ab8e744d69d083c83
X-Correlation-Id: qa-1c724c3b-39b8-4d88-b473-a1497299137f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c724c3b-39b8-4d88-b473-a1497299137f
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-1c724c3b-39b8-4d88-b473-a1497299137f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d6c9cd44-6b89-4804-8963-1ed5b6d26746

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6c9cd44-6b89-4804-8963-1ed5b6d26746
Content-Type: application/json

--- request body ---
{"handle":"qa-38f29f5e1ffa","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6c9cd44-6b89-4804-8963-1ed5b6d26746
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7fbf8be-4b84-48db-b65d-a40ad5e79d2b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6cab569-dc89-4cfd-a59b-c5cd6a9d0418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6cab569-dc89-4cfd-a59b-c5cd6a9d0418
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6cab569-dc89-4cfd-a59b-c5cd6a9d0418
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
correlation: qa-0d0b6c8b-99e7-4fc7-8042-356425c84549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d0b6c8b-99e7-4fc7-8042-356425c84549
Content-Type: application/json

--- request body ---
{"handle":"qa-38f29f5e1ffa","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d0b6c8b-99e7-4fc7-8042-356425c84549
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d0b6c8b-99e7-4fc7-8042-356425c84549"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43efe291-38e6-48c7-887e-4fa633352003

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43efe291-38e6-48c7-887e-4fa633352003
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43efe291-38e6-48c7-887e-4fa633352003
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b1bc4fc3-e6e7-4a30-88dc-26cdcdaa018c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1bc4fc3-e6e7-4a30-88dc-26cdcdaa018c
Content-Type: application/json

--- request body ---
{"handle":"qa-36de7c2a92b6","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1bc4fc3-e6e7-4a30-88dc-26cdcdaa018c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1bc4fc3-e6e7-4a30-88dc-26cdcdaa018c"}
```
