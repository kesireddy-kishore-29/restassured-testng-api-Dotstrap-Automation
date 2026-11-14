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
| 1 | `POST /v1/accounts` | 201 | 385 | `qa-7dd3423e-ec8a-4034-bd6f-955fa9207fb3` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-67214abe-d918-4c21-87eb-7bc4aae4614a` |
| 3 | `GET /v1/credits/balance` | 200 | 37 | `qa-3fdfd0e2-fe3c-4018-b8df-b27315cdd9da` |
| 4 | `POST /v1/credits/purchases` | 201 | 29 | `qa-1dcdb558-0664-4487-a1ee-d696efb94ae7` |
| 5 | `GET /v1/credits/ledger` | 200 | 15 | `qa-0fc83d3c-2733-4c72-b993-bfe7a885e7f2` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-6af7280f-71a1-4619-8737-7814bc18c7f6` |
| 7 | `POST /v1/auth/token` | 401 | 35 | `qa-317725c3-a615-4532-8257-8d7321b86df4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7dd3423e-ec8a-4034-bd6f-955fa9207fb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd3423e-ec8a-4034-bd6f-955fa9207fb3
Content-Type: application/json

--- request body ---
{"handle":"qa-5964ade7629c","displayName":"QA 5964ade7629c","password":"****","region":"in"}

--- response: 201 in 385 ms ---
Date: Fri, 13 Nov 2026 09:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dd3423e-ec8a-4034-bd6f-955fa9207fb3
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
Location: /v1/accounts/qa-5964ade7629c
X-Served-Region: in
Content-Length: 181

{"id":"acc_27d2054f-7367-4581-b6fa-c98c736c10d4","handle":"qa-5964ade7629c","displayName":"QA 5964ade7629c","region":"in","role":"user","createdAt":"2026-11-13T09:42:04.697007259Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-67214abe-d918-4c21-87eb-7bc4aae4614a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67214abe-d918-4c21-87eb-7bc4aae4614a
Content-Type: application/json

--- request body ---
{"handle":"qa-5964ade7629c","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-67214abe-d918-4c21-87eb-7bc4aae4614a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27d2054f-7367-4581-b6fa-c98c736c10d4"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-3fdfd0e2-fe3c-4018-b8df-b27315cdd9da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fdfd0e2-fe3c-4018-b8df-b27315cdd9da
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fdfd0e2-fe3c-4018-b8df-b27315cdd9da
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

{"balance":5,"currency":"credits","accountId":"acc_27d2054f-7367-4581-b6fa-c98c736c10d4"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1dcdb558-0664-4487-a1ee-d696efb94ae7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fd375aa6e9cb49be91ab58100ba9244a
X-Correlation-Id: qa-1dcdb558-0664-4487-a1ee-d696efb94ae7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dcdb558-0664-4487-a1ee-d696efb94ae7
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
Location: /v1/credits/purchases/pur_87e507f7-fa48-47eb-bb29-1710a2bf550a
Content-Length: 144

{"id":"pur_87e507f7-fa48-47eb-bb29-1710a2bf550a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:05.205209250Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-0fc83d3c-2733-4c72-b993-bfe7a885e7f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc83d3c-2733-4c72-b993-bfe7a885e7f2
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fc83d3c-2733-4c72-b993-bfe7a885e7f2
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

{"items":[{"id":"led_48d7b0fb-845f-4eec-847b-256c5786205a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:04.697022843Z"},{"id":"led_e1774066-445f-47b6-9269-51b521fb7ced","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_87e507f7-fa48-47eb-bb29-1710a2bf550a","createdAt":"2026-11-13T09:42:05.205209250Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6af7280f-71a1-4619-8737-7814bc18c7f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af7280f-71a1-4619-8737-7814bc18c7f6
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6af7280f-71a1-4619-8737-7814bc18c7f6
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
correlation: qa-317725c3-a615-4532-8257-8d7321b86df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317725c3-a615-4532-8257-8d7321b86df4
Content-Type: application/json

--- request body ---
{"handle":"qa-5964ade7629c","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-317725c3-a615-4532-8257-8d7321b86df4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-317725c3-a615-4532-8257-8d7321b86df4"}
```
