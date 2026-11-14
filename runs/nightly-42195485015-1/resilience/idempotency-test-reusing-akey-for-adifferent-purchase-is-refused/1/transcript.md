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
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-af9baeb8-dc08-4b84-839f-0b48d9a5c0ff` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-b3532d03-a1ea-489a-b25c-ec39f866647f` |
| 3 | `POST /v1/credits/purchases` | 201 | 53 | `qa-f4602a2c-7aeb-43de-acb9-6914e27961c2` |
| 4 | `POST /v1/credits/purchases` | 409 | 24 | `qa-59dd20c7-14de-4acf-afdf-4b36102efa62` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-f6b47e47-09e9-467d-8f93-b496aaa51db5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ff5ff529-67d5-40ba-8870-f009c46045a3` |
| 7 | `POST /v1/auth/token` | 401 | 9 | `qa-9597bdf6-dafc-4153-aab0-ce11d0f331c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af9baeb8-dc08-4b84-839f-0b48d9a5c0ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af9baeb8-dc08-4b84-839f-0b48d9a5c0ff
Content-Type: application/json

--- request body ---
{"handle":"qa-af403d722313","displayName":"QA af403d722313","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-af9baeb8-dc08-4b84-839f-0b48d9a5c0ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-af403d722313
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a08286b-668a-41f5-a482-2553274dd1c5","handle":"qa-af403d722313","displayName":"QA af403d722313","region":"eu","role":"user","createdAt":"2026-11-06T09:30:30.933063314Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b3532d03-a1ea-489a-b25c-ec39f866647f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3532d03-a1ea-489a-b25c-ec39f866647f
Content-Type: application/json

--- request body ---
{"handle":"qa-af403d722313","password":"****"}

--- response: 200 in 81 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3532d03-a1ea-489a-b25c-ec39f866647f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a08286b-668a-41f5-a482-2553274dd1c5"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f4602a2c-7aeb-43de-acb9-6914e27961c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5cdb4ae31142455484271e3402b50310
X-Correlation-Id: qa-f4602a2c-7aeb-43de-acb9-6914e27961c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4602a2c-7aeb-43de-acb9-6914e27961c2
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
Location: /v1/credits/purchases/pur_ff41a36f-630c-46ec-a175-b4077cdb60d2
Content-Length: 144

{"id":"pur_ff41a36f-630c-46ec-a175-b4077cdb60d2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.652738311Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-59dd20c7-14de-4acf-afdf-4b36102efa62

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5cdb4ae31142455484271e3402b50310
X-Correlation-Id: qa-59dd20c7-14de-4acf-afdf-4b36102efa62
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59dd20c7-14de-4acf-afdf-4b36102efa62
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-59dd20c7-14de-4acf-afdf-4b36102efa62"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f6b47e47-09e9-467d-8f93-b496aaa51db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6b47e47-09e9-467d-8f93-b496aaa51db5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6b47e47-09e9-467d-8f93-b496aaa51db5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_2a08286b-668a-41f5-a482-2553274dd1c5"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff5ff529-67d5-40ba-8870-f009c46045a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff5ff529-67d5-40ba-8870-f009c46045a3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff5ff529-67d5-40ba-8870-f009c46045a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-9597bdf6-dafc-4153-aab0-ce11d0f331c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9597bdf6-dafc-4153-aab0-ce11d0f331c5
Content-Type: application/json

--- request body ---
{"handle":"qa-af403d722313","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9597bdf6-dafc-4153-aab0-ce11d0f331c5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9597bdf6-dafc-4153-aab0-ce11d0f331c5"}
```
