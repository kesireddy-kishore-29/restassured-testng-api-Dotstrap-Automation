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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-b87f14dd-ac8d-4d27-b7b9-b5ed1adc724a` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-5f323df7-e2ac-49b0-844e-44c60446ff05` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-3251b0af-2033-4d00-bd3c-22ac4ddd75a5` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-907106d7-fd80-4eae-852b-c4542ec3691a` |
| 5 | `POST /v1/credits/purchases` | 415 | 17 | `qa-e7431785-c657-42d1-a3df-771cc60a7ab2` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-3441213d-1c77-48b9-9dda-92cd688a8277` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-fc4fbbae-3699-463c-ac5e-f9f8dc1a5f88` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-864c10ee-caab-4a48-a959-3a878405c6c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-430838c8-879a-4f23-9de2-7da80c791817` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-431a7adb-a6ae-4756-90d6-cff886e5866f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b87f14dd-ac8d-4d27-b7b9-b5ed1adc724a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b87f14dd-ac8d-4d27-b7b9-b5ed1adc724a
Content-Type: application/json

--- request body ---
{"handle":"qa-61f6caf50594","displayName":"QA 61f6caf50594","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b87f14dd-ac8d-4d27-b7b9-b5ed1adc724a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Location: /v1/accounts/qa-61f6caf50594
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e79a3395-16c8-4670-9c9c-a9dcd64dede9","handle":"qa-61f6caf50594","displayName":"QA 61f6caf50594","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.931733865Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f323df7-e2ac-49b0-844e-44c60446ff05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f323df7-e2ac-49b0-844e-44c60446ff05
Content-Type: application/json

--- request body ---
{"handle":"qa-fdeecb701f17","displayName":"QA fdeecb701f17","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f323df7-e2ac-49b0-844e-44c60446ff05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Location: /v1/accounts/qa-fdeecb701f17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e55e49cc-0e4d-49d6-8fe0-7db70a6a7353","handle":"qa-fdeecb701f17","displayName":"QA fdeecb701f17","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.990580830Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3251b0af-2033-4d00-bd3c-22ac4ddd75a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3251b0af-2033-4d00-bd3c-22ac4ddd75a5
Content-Type: application/json

--- request body ---
{"handle":"qa-61f6caf50594","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-3251b0af-2033-4d00-bd3c-22ac4ddd75a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e79a3395-16c8-4670-9c9c-a9dcd64dede9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-907106d7-fd80-4eae-852b-c4542ec3691a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-907106d7-fd80-4eae-852b-c4542ec3691a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fdeecb701f17","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-907106d7-fd80-4eae-852b-c4542ec3691a
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
Location: /v1/conversations/cnv_cffe0a48-f1d6-433e-af16-672cac53d18f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cffe0a48-f1d6-433e-af16-672cac53d18f","subject":"Error contract","status":"open","region":"eu","participants":["qa-61f6caf50594","qa-fdeecb701f17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:39.043688106Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e7431785-c657-42d1-a3df-771cc60a7ab2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e35590f6cf9042a78c057f67d0935c41
X-Correlation-Id: qa-e7431785-c657-42d1-a3df-771cc60a7ab2
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7431785-c657-42d1-a3df-771cc60a7ab2
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-e7431785-c657-42d1-a3df-771cc60a7ab2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3441213d-1c77-48b9-9dda-92cd688a8277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3441213d-1c77-48b9-9dda-92cd688a8277
Content-Type: application/json

--- request body ---
{"handle":"qa-fdeecb701f17","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-3441213d-1c77-48b9-9dda-92cd688a8277
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e55e49cc-0e4d-49d6-8fe0-7db70a6a7353"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc4fbbae-3699-463c-ac5e-f9f8dc1a5f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc4fbbae-3699-463c-ac5e-f9f8dc1a5f88
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc4fbbae-3699-463c-ac5e-f9f8dc1a5f88
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
correlation: qa-864c10ee-caab-4a48-a959-3a878405c6c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-864c10ee-caab-4a48-a959-3a878405c6c4
Content-Type: application/json

--- request body ---
{"handle":"qa-fdeecb701f17","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-864c10ee-caab-4a48-a959-3a878405c6c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-864c10ee-caab-4a48-a959-3a878405c6c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-430838c8-879a-4f23-9de2-7da80c791817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-430838c8-879a-4f23-9de2-7da80c791817
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-430838c8-879a-4f23-9de2-7da80c791817
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
correlation: qa-431a7adb-a6ae-4756-90d6-cff886e5866f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431a7adb-a6ae-4756-90d6-cff886e5866f
Content-Type: application/json

--- request body ---
{"handle":"qa-61f6caf50594","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-431a7adb-a6ae-4756-90d6-cff886e5866f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-431a7adb-a6ae-4756-90d6-cff886e5866f"}
```
