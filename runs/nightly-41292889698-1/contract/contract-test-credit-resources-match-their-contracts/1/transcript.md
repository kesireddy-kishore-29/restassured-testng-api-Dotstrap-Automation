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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-b17eba56-e2db-4026-8cab-c470d0cd0408` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-57652c30-96f0-4260-a834-23a3f35473e6` |
| 3 | `GET /v1/credits/balance` | 200 | 10 | `qa-e2585db2-0a0d-4c6f-b20c-f0ffa7b3596d` |
| 4 | `POST /v1/credits/purchases` | 201 | 13 | `qa-f2488ffd-6c38-410e-afaf-5019f4a8a55a` |
| 5 | `GET /v1/credits/ledger` | 200 | 9 | `qa-c3e0f8aa-9178-40cb-86c0-da675f92d60f` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f9daf2e5-68c7-47c5-9458-17998372a899` |
| 7 | `POST /v1/auth/token` | 401 | 13 | `qa-9660c60a-6273-4d2c-8f57-5002a7efadcb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b17eba56-e2db-4026-8cab-c470d0cd0408

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b17eba56-e2db-4026-8cab-c470d0cd0408
Content-Type: application/json

--- request body ---
{"handle":"qa-3f6c6efbf5de","displayName":"QA 3f6c6efbf5de","password":"****","region":"in"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b17eba56-e2db-4026-8cab-c470d0cd0408
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-3f6c6efbf5de
X-Served-Region: in
Content-Length: 181

{"id":"acc_b5d7993a-3237-4171-946e-8df06a35895d","handle":"qa-3f6c6efbf5de","displayName":"QA 3f6c6efbf5de","region":"in","role":"user","createdAt":"2026-11-01T09:23:24.651828364Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-57652c30-96f0-4260-a834-23a3f35473e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57652c30-96f0-4260-a834-23a3f35473e6
Content-Type: application/json

--- request body ---
{"handle":"qa-3f6c6efbf5de","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-57652c30-96f0-4260-a834-23a3f35473e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5d7993a-3237-4171-946e-8df06a35895d"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-e2585db2-0a0d-4c6f-b20c-f0ffa7b3596d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2585db2-0a0d-4c6f-b20c-f0ffa7b3596d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2585db2-0a0d-4c6f-b20c-f0ffa7b3596d
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

{"balance":5,"currency":"credits","accountId":"acc_b5d7993a-3237-4171-946e-8df06a35895d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f2488ffd-6c38-410e-afaf-5019f4a8a55a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1695faa995a742a4a38908c29ff3c57c
X-Correlation-Id: qa-f2488ffd-6c38-410e-afaf-5019f4a8a55a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2488ffd-6c38-410e-afaf-5019f4a8a55a
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
Location: /v1/credits/purchases/pur_2a2cb9f8-6621-4a8b-a519-221cbbd0c1be
Content-Length: 144

{"id":"pur_2a2cb9f8-6621-4a8b-a519-221cbbd0c1be","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:24.709663147Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c3e0f8aa-9178-40cb-86c0-da675f92d60f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e0f8aa-9178-40cb-86c0-da675f92d60f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3e0f8aa-9178-40cb-86c0-da675f92d60f
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

{"items":[{"id":"led_32596d7d-5f11-4ce4-b38d-500417de8d5b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:24.651834443Z"},{"id":"led_f57e33fd-c389-48cf-bb75-4c989b0c4f85","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_2a2cb9f8-6621-4a8b-a519-221cbbd0c1be","createdAt":"2026-11-01T09:23:24.709663147Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9daf2e5-68c7-47c5-9458-17998372a899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9daf2e5-68c7-47c5-9458-17998372a899
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9daf2e5-68c7-47c5-9458-17998372a899
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
correlation: qa-9660c60a-6273-4d2c-8f57-5002a7efadcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9660c60a-6273-4d2c-8f57-5002a7efadcb
Content-Type: application/json

--- request body ---
{"handle":"qa-3f6c6efbf5de","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9660c60a-6273-4d2c-8f57-5002a7efadcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9660c60a-6273-4d2c-8f57-5002a7efadcb"}
```
