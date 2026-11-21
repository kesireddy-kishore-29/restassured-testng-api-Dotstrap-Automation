# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-abfdefb3-2ea5-408f-b769-e45fc1072a6c` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-520bdf28-a9ee-4a02-9ea5-62938bd632d1` |
| 3 | `POST /v1/auth/token` | 200 | 6 | `qa-f3c7c759-7b7d-44e6-b82a-5353e2e794a4` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-6f75ef0d-a52d-4eaa-ac09-c90174530d95` |
| 5 | `POST /v1/credits/purchases` | 415 | 7 | `qa-e42ee75f-669e-4cca-8556-6081973f88e0` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-571730de-ab68-4f63-b0d0-6ab037d77d86` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-143e6201-330e-43b9-939a-d75e86a6fbd5` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-3fab62f0-6041-4a34-aa35-04a2528d9719` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-3984c917-0b7d-45ad-8e6c-0dae723703c4` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-b1668e6f-bf05-48f0-8faf-2fbdcc40e5cb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-abfdefb3-2ea5-408f-b769-e45fc1072a6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfdefb3-2ea5-408f-b769-e45fc1072a6c
Content-Type: application/json

--- request body ---
{"handle":"qa-13f99756645f","displayName":"QA 13f99756645f","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-abfdefb3-2ea5-408f-b769-e45fc1072a6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Location: /v1/accounts/qa-13f99756645f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_782a2d1a-8046-4433-b08c-2aacba2ef8ef","handle":"qa-13f99756645f","displayName":"QA 13f99756645f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.598492711Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-520bdf28-a9ee-4a02-9ea5-62938bd632d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-520bdf28-a9ee-4a02-9ea5-62938bd632d1
Content-Type: application/json

--- request body ---
{"handle":"qa-90a5bbda4fe0","displayName":"QA 90a5bbda4fe0","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-520bdf28-a9ee-4a02-9ea5-62938bd632d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Location: /v1/accounts/qa-90a5bbda4fe0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac56a1d4-6a55-4b77-a77a-765c5c814ed0","handle":"qa-90a5bbda4fe0","displayName":"QA 90a5bbda4fe0","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.636911795Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f3c7c759-7b7d-44e6-b82a-5353e2e794a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3c7c759-7b7d-44e6-b82a-5353e2e794a4
Content-Type: application/json

--- request body ---
{"handle":"qa-13f99756645f","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3c7c759-7b7d-44e6-b82a-5353e2e794a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_782a2d1a-8046-4433-b08c-2aacba2ef8ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6f75ef0d-a52d-4eaa-ac09-c90174530d95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f75ef0d-a52d-4eaa-ac09-c90174530d95
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-90a5bbda4fe0","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f75ef0d-a52d-4eaa-ac09-c90174530d95
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
Location: /v1/conversations/cnv_a2540708-2670-4a93-8882-b00e78e28828
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a2540708-2670-4a93-8882-b00e78e28828","subject":"Error contract","status":"open","region":"eu","participants":["qa-13f99756645f","qa-90a5bbda4fe0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.668590984Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e42ee75f-669e-4cca-8556-6081973f88e0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-914b0a12dcb14cceb5bd48cf6907505d
X-Correlation-Id: qa-e42ee75f-669e-4cca-8556-6081973f88e0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e42ee75f-669e-4cca-8556-6081973f88e0
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-e42ee75f-669e-4cca-8556-6081973f88e0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-571730de-ab68-4f63-b0d0-6ab037d77d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-571730de-ab68-4f63-b0d0-6ab037d77d86
Content-Type: application/json

--- request body ---
{"handle":"qa-90a5bbda4fe0","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-571730de-ab68-4f63-b0d0-6ab037d77d86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac56a1d4-6a55-4b77-a77a-765c5c814ed0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-143e6201-330e-43b9-939a-d75e86a6fbd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-143e6201-330e-43b9-939a-d75e86a6fbd5
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-143e6201-330e-43b9-939a-d75e86a6fbd5
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
correlation: qa-3fab62f0-6041-4a34-aa35-04a2528d9719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fab62f0-6041-4a34-aa35-04a2528d9719
Content-Type: application/json

--- request body ---
{"handle":"qa-90a5bbda4fe0","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fab62f0-6041-4a34-aa35-04a2528d9719
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3fab62f0-6041-4a34-aa35-04a2528d9719"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3984c917-0b7d-45ad-8e6c-0dae723703c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3984c917-0b7d-45ad-8e6c-0dae723703c4
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3984c917-0b7d-45ad-8e6c-0dae723703c4
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
correlation: qa-b1668e6f-bf05-48f0-8faf-2fbdcc40e5cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1668e6f-bf05-48f0-8faf-2fbdcc40e5cb
Content-Type: application/json

--- request body ---
{"handle":"qa-13f99756645f","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1668e6f-bf05-48f0-8faf-2fbdcc40e5cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1668e6f-bf05-48f0-8faf-2fbdcc40e5cb"}
```
