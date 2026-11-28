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
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-f761e394-6545-44aa-887c-712a2b3d960f` |
| 2 | `POST /v1/auth/token` | 200 | 73 | `qa-4e76df36-c0ff-48a7-a358-fb65eab5b471` |
| 3 | `GET /v1/credits/balance` | 200 | 42 | `qa-71fcb5a2-5c15-45e3-a785-fa0b90ae55d8` |
| 4 | `POST /v1/credits/purchases` | 201 | 42 | `qa-04dfb986-b66f-46ba-af50-67825c668667` |
| 5 | `GET /v1/credits/ledger` | 200 | 15 | `qa-25a0842f-1364-45e0-a57a-806f38a013a9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-48f8cd7d-d3a9-4653-bf01-7fa17a31ff14` |
| 7 | `POST /v1/auth/token` | 401 | 17 | `qa-f9bc1ba9-8046-4b99-91cb-e9001e0f4e6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f761e394-6545-44aa-887c-712a2b3d960f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f761e394-6545-44aa-887c-712a2b3d960f
Content-Type: application/json

--- request body ---
{"handle":"qa-30ddb6bc1b9d","displayName":"QA 30ddb6bc1b9d","password":"****","region":"in"}

--- response: 201 in 455 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f761e394-6545-44aa-887c-712a2b3d960f
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
Location: /v1/accounts/qa-30ddb6bc1b9d
X-Served-Region: in
Content-Length: 181

{"id":"acc_c578aeef-c2e2-46bf-8635-c3069d9d4ffc","handle":"qa-30ddb6bc1b9d","displayName":"QA 30ddb6bc1b9d","region":"in","role":"user","createdAt":"2026-11-26T11:02:42.436475892Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4e76df36-c0ff-48a7-a358-fb65eab5b471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e76df36-c0ff-48a7-a358-fb65eab5b471
Content-Type: application/json

--- request body ---
{"handle":"qa-30ddb6bc1b9d","password":"****"}

--- response: 200 in 73 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e76df36-c0ff-48a7-a358-fb65eab5b471
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c578aeef-c2e2-46bf-8635-c3069d9d4ffc"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-71fcb5a2-5c15-45e3-a785-fa0b90ae55d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71fcb5a2-5c15-45e3-a785-fa0b90ae55d8
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-71fcb5a2-5c15-45e3-a785-fa0b90ae55d8
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

{"balance":5,"currency":"credits","accountId":"acc_c578aeef-c2e2-46bf-8635-c3069d9d4ffc"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-04dfb986-b66f-46ba-af50-67825c668667

--- request headers ---
Accept: application/json
Idempotency-Key: qa-df89e89eb0004f4f8de7c0374e66ffdf
X-Correlation-Id: qa-04dfb986-b66f-46ba-af50-67825c668667
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-04dfb986-b66f-46ba-af50-67825c668667
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
Location: /v1/credits/purchases/pur_947f8556-185c-4b4e-9e1d-49f1b2682f75
Content-Length: 144

{"id":"pur_947f8556-185c-4b4e-9e1d-49f1b2682f75","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:43.120166313Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-25a0842f-1364-45e0-a57a-806f38a013a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a0842f-1364-45e0-a57a-806f38a013a9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-25a0842f-1364-45e0-a57a-806f38a013a9
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

{"items":[{"id":"led_ce718328-daff-401f-82dc-8f4a3f1f4e01","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:42.436493565Z"},{"id":"led_bf5823cd-8628-427f-9218-a0516796d1c2","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_947f8556-185c-4b4e-9e1d-49f1b2682f75","createdAt":"2026-11-26T11:02:43.120166313Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48f8cd7d-d3a9-4653-bf01-7fa17a31ff14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48f8cd7d-d3a9-4653-bf01-7fa17a31ff14
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48f8cd7d-d3a9-4653-bf01-7fa17a31ff14
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
correlation: qa-f9bc1ba9-8046-4b99-91cb-e9001e0f4e6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9bc1ba9-8046-4b99-91cb-e9001e0f4e6d
Content-Type: application/json

--- request body ---
{"handle":"qa-30ddb6bc1b9d","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9bc1ba9-8046-4b99-91cb-e9001e0f4e6d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9bc1ba9-8046-4b99-91cb-e9001e0f4e6d"}
```
