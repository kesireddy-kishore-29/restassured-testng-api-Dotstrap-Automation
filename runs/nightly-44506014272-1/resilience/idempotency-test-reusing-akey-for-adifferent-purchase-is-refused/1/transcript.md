# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 374 | `qa-898407ff-0777-427c-bbb7-f19830e0f140` |
| 2 | `POST /v1/auth/token` | 200 | 58 | `qa-5b78fd36-7e3a-45ab-b40e-0182ac26f934` |
| 3 | `POST /v1/credits/purchases` | 201 | 39 | `qa-15d3f6af-ae16-4d68-9e69-6a3c04f60b91` |
| 4 | `POST /v1/credits/purchases` | 409 | 29 | `qa-986ba4b4-ff1a-4ea2-b9c8-0f8e5d623402` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-7b561c08-3f25-44bd-baa0-da1081afe1ac` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e1712f33-fcef-49b7-8cad-ed8259147b76` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-8f81cfc7-7cfd-4986-a93d-6b8a5bcd3718` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-898407ff-0777-427c-bbb7-f19830e0f140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-898407ff-0777-427c-bbb7-f19830e0f140
Content-Type: application/json

--- request body ---
{"handle":"qa-b8fb628f3fda","displayName":"QA b8fb628f3fda","password":"****","region":"eu"}

--- response: 201 in 374 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-898407ff-0777-427c-bbb7-f19830e0f140
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-b8fb628f3fda
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79557115-4069-47be-849a-96b982a957a9","handle":"qa-b8fb628f3fda","displayName":"QA b8fb628f3fda","region":"eu","role":"user","createdAt":"2026-11-19T10:29:12.098827268Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5b78fd36-7e3a-45ab-b40e-0182ac26f934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b78fd36-7e3a-45ab-b40e-0182ac26f934
Content-Type: application/json

--- request body ---
{"handle":"qa-b8fb628f3fda","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b78fd36-7e3a-45ab-b40e-0182ac26f934
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79557115-4069-47be-849a-96b982a957a9"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-15d3f6af-ae16-4d68-9e69-6a3c04f60b91

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bb4f0090ebcf4cecb32e8006436f199b
X-Correlation-Id: qa-15d3f6af-ae16-4d68-9e69-6a3c04f60b91
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-15d3f6af-ae16-4d68-9e69-6a3c04f60b91
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
Location: /v1/credits/purchases/pur_73bba3cd-166c-4ddd-b496-a96e19904004
Content-Length: 144

{"id":"pur_73bba3cd-166c-4ddd-b496-a96e19904004","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:12.593119871Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-986ba4b4-ff1a-4ea2-b9c8-0f8e5d623402

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bb4f0090ebcf4cecb32e8006436f199b
X-Correlation-Id: qa-986ba4b4-ff1a-4ea2-b9c8-0f8e5d623402
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-986ba4b4-ff1a-4ea2-b9c8-0f8e5d623402
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-986ba4b4-ff1a-4ea2-b9c8-0f8e5d623402"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-7b561c08-3f25-44bd-baa0-da1081afe1ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b561c08-3f25-44bd-baa0-da1081afe1ac
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b561c08-3f25-44bd-baa0-da1081afe1ac
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_79557115-4069-47be-849a-96b982a957a9"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1712f33-fcef-49b7-8cad-ed8259147b76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1712f33-fcef-49b7-8cad-ed8259147b76
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1712f33-fcef-49b7-8cad-ed8259147b76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8f81cfc7-7cfd-4986-a93d-6b8a5bcd3718

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f81cfc7-7cfd-4986-a93d-6b8a5bcd3718
Content-Type: application/json

--- request body ---
{"handle":"qa-b8fb628f3fda","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f81cfc7-7cfd-4986-a93d-6b8a5bcd3718
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f81cfc7-7cfd-4986-a93d-6b8a5bcd3718"}
```
