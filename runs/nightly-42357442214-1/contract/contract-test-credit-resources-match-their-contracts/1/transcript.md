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
| 1 | `POST /v1/accounts` | 201 | 341 | `qa-9652e963-1de4-40b0-a935-aaad073919aa` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-9aff1719-ba66-47e9-99a9-bfce526db836` |
| 3 | `GET /v1/credits/balance` | 200 | 37 | `qa-f987e00e-a857-4ae9-9850-1f8274506352` |
| 4 | `POST /v1/credits/purchases` | 201 | 22 | `qa-6bf24022-0f30-4ebe-9740-634439d14329` |
| 5 | `GET /v1/credits/ledger` | 200 | 26 | `qa-795ee098-c5ba-4f7f-a158-d0e8212d4b5f` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5557a300-1245-41ed-a961-a53f721c2d15` |
| 7 | `POST /v1/auth/token` | 401 | 15 | `qa-facb289d-a37c-44fc-9795-89530c86ddcf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9652e963-1de4-40b0-a935-aaad073919aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9652e963-1de4-40b0-a935-aaad073919aa
Content-Type: application/json

--- request body ---
{"handle":"qa-63dd62f535c7","displayName":"QA 63dd62f535c7","password":"****","region":"in"}

--- response: 201 in 341 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9652e963-1de4-40b0-a935-aaad073919aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-63dd62f535c7
X-Served-Region: in
Content-Length: 181

{"id":"acc_e754040c-b786-4285-8389-3319867833d6","handle":"qa-63dd62f535c7","displayName":"QA 63dd62f535c7","region":"in","role":"user","createdAt":"2026-11-07T08:54:56.349843082Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9aff1719-ba66-47e9-99a9-bfce526db836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aff1719-ba66-47e9-99a9-bfce526db836
Content-Type: application/json

--- request body ---
{"handle":"qa-63dd62f535c7","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aff1719-ba66-47e9-99a9-bfce526db836
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e754040c-b786-4285-8389-3319867833d6"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-f987e00e-a857-4ae9-9850-1f8274506352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f987e00e-a857-4ae9-9850-1f8274506352
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f987e00e-a857-4ae9-9850-1f8274506352
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

{"balance":5,"currency":"credits","accountId":"acc_e754040c-b786-4285-8389-3319867833d6"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6bf24022-0f30-4ebe-9740-634439d14329

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d5bf45fd2d5247efbb358344345f3006
X-Correlation-Id: qa-6bf24022-0f30-4ebe-9740-634439d14329
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bf24022-0f30-4ebe-9740-634439d14329
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
Location: /v1/credits/purchases/pur_029483b0-3c8c-4ee2-8faa-8859e077a123
Content-Length: 144

{"id":"pur_029483b0-3c8c-4ee2-8faa-8859e077a123","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:54:56.825870774Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-795ee098-c5ba-4f7f-a158-d0e8212d4b5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795ee098-c5ba-4f7f-a158-d0e8212d4b5f
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-795ee098-c5ba-4f7f-a158-d0e8212d4b5f
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

{"items":[{"id":"led_21962a81-3fd1-4c8b-bbcc-a83ccd5a886d","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:54:56.349866297Z"},{"id":"led_0ddcc0c1-6dbd-4bf9-8784-39f20ed5480c","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_029483b0-3c8c-4ee2-8faa-8859e077a123","createdAt":"2026-11-07T08:54:56.825870774Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5557a300-1245-41ed-a961-a53f721c2d15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5557a300-1245-41ed-a961-a53f721c2d15
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5557a300-1245-41ed-a961-a53f721c2d15
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
correlation: qa-facb289d-a37c-44fc-9795-89530c86ddcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-facb289d-a37c-44fc-9795-89530c86ddcf
Content-Type: application/json

--- request body ---
{"handle":"qa-63dd62f535c7","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-facb289d-a37c-44fc-9795-89530c86ddcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-facb289d-a37c-44fc-9795-89530c86ddcf"}
```
