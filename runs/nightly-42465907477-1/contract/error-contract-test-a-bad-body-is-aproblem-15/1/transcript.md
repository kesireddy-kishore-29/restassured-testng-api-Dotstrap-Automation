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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-4b6b81b2-8920-4244-99b3-5d914e91ab8c` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-b0099927-c39c-42dd-a382-4bcdadf3f834` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-9b63ec3d-49cf-4cb4-9100-3137d87260ab` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-53387a41-5562-4583-8ecd-23cdb466bc90` |
| 5 | `POST /v1/credits/purchases` | 400 | 17 | `qa-b6cbf739-56a0-4d47-ab5b-daa1d2aa52ba` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-358bc778-861f-44e6-8832-d22453ebead4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-76f3aff4-f908-4276-8471-7cc62f7396b1` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-758887bf-9392-4cc0-ad65-078189c8780c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-77f497c8-8fa6-448a-9f6f-3bf27fa4f27b` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-6e4342e6-861f-4707-9e85-a75ac60f3349` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b6b81b2-8920-4244-99b3-5d914e91ab8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b6b81b2-8920-4244-99b3-5d914e91ab8c
Content-Type: application/json

--- request body ---
{"handle":"qa-73454fdee61d","displayName":"QA 73454fdee61d","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b6b81b2-8920-4244-99b3-5d914e91ab8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Location: /v1/accounts/qa-73454fdee61d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc129fa9-4f9f-4b68-8b96-9b118e4b3456","handle":"qa-73454fdee61d","displayName":"QA 73454fdee61d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.509076373Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b0099927-c39c-42dd-a382-4bcdadf3f834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0099927-c39c-42dd-a382-4bcdadf3f834
Content-Type: application/json

--- request body ---
{"handle":"qa-0bf92eb0e0a0","displayName":"QA 0bf92eb0e0a0","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0099927-c39c-42dd-a382-4bcdadf3f834
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Location: /v1/accounts/qa-0bf92eb0e0a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_114ea696-b5c8-43bc-ad52-51efc9c7275c","handle":"qa-0bf92eb0e0a0","displayName":"QA 0bf92eb0e0a0","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.527024565Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9b63ec3d-49cf-4cb4-9100-3137d87260ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b63ec3d-49cf-4cb4-9100-3137d87260ab
Content-Type: application/json

--- request body ---
{"handle":"qa-73454fdee61d","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b63ec3d-49cf-4cb4-9100-3137d87260ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc129fa9-4f9f-4b68-8b96-9b118e4b3456"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-53387a41-5562-4583-8ecd-23cdb466bc90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53387a41-5562-4583-8ecd-23cdb466bc90
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0bf92eb0e0a0","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-53387a41-5562-4583-8ecd-23cdb466bc90
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
Location: /v1/conversations/cnv_7561e7da-4b61-4359-b9e9-230ddf8f322b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7561e7da-4b61-4359-b9e9-230ddf8f322b","subject":"Error contract","status":"open","region":"eu","participants":["qa-73454fdee61d","qa-0bf92eb0e0a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.557534576Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b6cbf739-56a0-4d47-ab5b-daa1d2aa52ba

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8f2eedb4309d48b2a4427ad891edf12d
X-Correlation-Id: qa-b6cbf739-56a0-4d47-ab5b-daa1d2aa52ba
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6cbf739-56a0-4d47-ab5b-daa1d2aa52ba
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-b6cbf739-56a0-4d47-ab5b-daa1d2aa52ba"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-358bc778-861f-44e6-8832-d22453ebead4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358bc778-861f-44e6-8832-d22453ebead4
Content-Type: application/json

--- request body ---
{"handle":"qa-0bf92eb0e0a0","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-358bc778-861f-44e6-8832-d22453ebead4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_114ea696-b5c8-43bc-ad52-51efc9c7275c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76f3aff4-f908-4276-8471-7cc62f7396b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f3aff4-f908-4276-8471-7cc62f7396b1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76f3aff4-f908-4276-8471-7cc62f7396b1
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
correlation: qa-758887bf-9392-4cc0-ad65-078189c8780c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758887bf-9392-4cc0-ad65-078189c8780c
Content-Type: application/json

--- request body ---
{"handle":"qa-0bf92eb0e0a0","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-758887bf-9392-4cc0-ad65-078189c8780c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-758887bf-9392-4cc0-ad65-078189c8780c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77f497c8-8fa6-448a-9f6f-3bf27fa4f27b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77f497c8-8fa6-448a-9f6f-3bf27fa4f27b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77f497c8-8fa6-448a-9f6f-3bf27fa4f27b
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
correlation: qa-6e4342e6-861f-4707-9e85-a75ac60f3349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4342e6-861f-4707-9e85-a75ac60f3349
Content-Type: application/json

--- request body ---
{"handle":"qa-73454fdee61d","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4342e6-861f-4707-9e85-a75ac60f3349
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e4342e6-861f-4707-9e85-a75ac60f3349"}
```
