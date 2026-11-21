# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 396 | `qa-ec81155a-aa88-47dc-af40-8041b86c5c7c` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-c24ee28c-857b-437a-ac0c-cce09590e0db` |
| 3 | `GET /v1/credits/balance` | 200 | 28 | `qa-6f677327-3dcd-4338-b759-cf367ae7f338` |
| 4 | `POST /v1/credits/purchases` | 201 | 33 | `qa-46adabcf-cf71-418d-9965-061544acfb80` |
| 5 | `GET /v1/credits/ledger` | 200 | 14 | `qa-b4ce2ac8-82b5-4d4c-b749-28539922a20c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4ecec10c-117e-489e-a8ed-fbc5cb18479a` |
| 7 | `POST /v1/auth/token` | 401 | 39 | `qa-e681bb75-9bf0-4216-97c0-fe6e3dfbcebb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec81155a-aa88-47dc-af40-8041b86c5c7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec81155a-aa88-47dc-af40-8041b86c5c7c
Content-Type: application/json

--- request body ---
{"handle":"qa-f5251ad58783","displayName":"QA f5251ad58783","password":"****","region":"in"}

--- response: 201 in 396 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec81155a-aa88-47dc-af40-8041b86c5c7c
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
Location: /v1/accounts/qa-f5251ad58783
X-Served-Region: in
Content-Length: 181

{"id":"acc_f38ecad6-5905-45a7-9fb2-3f76cf0e4528","handle":"qa-f5251ad58783","displayName":"QA f5251ad58783","region":"in","role":"user","createdAt":"2026-11-15T09:36:07.203505450Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c24ee28c-857b-437a-ac0c-cce09590e0db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24ee28c-857b-437a-ac0c-cce09590e0db
Content-Type: application/json

--- request body ---
{"handle":"qa-f5251ad58783","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c24ee28c-857b-437a-ac0c-cce09590e0db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f38ecad6-5905-45a7-9fb2-3f76cf0e4528"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-6f677327-3dcd-4338-b759-cf367ae7f338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f677327-3dcd-4338-b759-cf367ae7f338
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f677327-3dcd-4338-b759-cf367ae7f338
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_f38ecad6-5905-45a7-9fb2-3f76cf0e4528"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-46adabcf-cf71-418d-9965-061544acfb80

--- request headers ---
Accept: application/json
Idempotency-Key: qa-60a3e903404d4bacb7fc0aa5344c57eb
X-Correlation-Id: qa-46adabcf-cf71-418d-9965-061544acfb80
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-46adabcf-cf71-418d-9965-061544acfb80
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
X-Served-Region: in
Location: /v1/credits/purchases/pur_accbef81-e41b-417d-a0a0-20e48bf9ff43
Content-Length: 144

{"id":"pur_accbef81-e41b-417d-a0a0-20e48bf9ff43","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:07.739753914Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b4ce2ac8-82b5-4d4c-b749-28539922a20c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ce2ac8-82b5-4d4c-b749-28539922a20c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4ce2ac8-82b5-4d4c-b749-28539922a20c
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
X-Served-Region: in
Content-Length: 398

{"items":[{"id":"led_cca95e96-0c92-49e7-b870-ee7bdb51551a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:07.203523121Z"},{"id":"led_746d2158-11a7-46fa-8e6f-2ebe2e30e4d7","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_accbef81-e41b-417d-a0a0-20e48bf9ff43","createdAt":"2026-11-15T09:36:07.739753914Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ecec10c-117e-489e-a8ed-fbc5cb18479a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ecec10c-117e-489e-a8ed-fbc5cb18479a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ecec10c-117e-489e-a8ed-fbc5cb18479a
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
X-Served-Region: in
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e681bb75-9bf0-4216-97c0-fe6e3dfbcebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e681bb75-9bf0-4216-97c0-fe6e3dfbcebb
Content-Type: application/json

--- request body ---
{"handle":"qa-f5251ad58783","password":"****"}

--- response: 401 in 39 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e681bb75-9bf0-4216-97c0-fe6e3dfbcebb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e681bb75-9bf0-4216-97c0-fe6e3dfbcebb"}
```
