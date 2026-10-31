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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-41df4870-592b-4f1c-9ebd-056505b083d6` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-9e73114d-a72b-4669-b452-85022fd7e71d` |
| 3 | `GET /v1/credits/balance` | 200 | 4 | `qa-b6cdb9d5-4c33-494c-a9d3-7aaf5a865de3` |
| 4 | `POST /v1/credits/purchases` | 201 | 14 | `qa-2a35ca70-abb6-4b3c-aac1-420319bb2b49` |
| 5 | `GET /v1/credits/ledger` | 200 | 3 | `qa-de6530f5-dece-49dc-969f-6247a9519878` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2247676f-4789-43d2-a182-54f3cff179c0` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-d2d31669-5931-46a7-b0ea-6c1ec9af8cc8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41df4870-592b-4f1c-9ebd-056505b083d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41df4870-592b-4f1c-9ebd-056505b083d6
Content-Type: application/json

--- request body ---
{"handle":"qa-39330e0ea46e","displayName":"QA 39330e0ea46e","password":"****","region":"in"}

--- response: 201 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-41df4870-592b-4f1c-9ebd-056505b083d6
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
Location: /v1/accounts/qa-39330e0ea46e
X-Served-Region: in
Content-Length: 181

{"id":"acc_2e023596-1fee-48b1-bbb4-66f113920e76","handle":"qa-39330e0ea46e","displayName":"QA 39330e0ea46e","region":"in","role":"user","createdAt":"2026-10-31T08:31:37.443232420Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9e73114d-a72b-4669-b452-85022fd7e71d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e73114d-a72b-4669-b452-85022fd7e71d
Content-Type: application/json

--- request body ---
{"handle":"qa-39330e0ea46e","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e73114d-a72b-4669-b452-85022fd7e71d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2e023596-1fee-48b1-bbb4-66f113920e76"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-b6cdb9d5-4c33-494c-a9d3-7aaf5a865de3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6cdb9d5-4c33-494c-a9d3-7aaf5a865de3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6cdb9d5-4c33-494c-a9d3-7aaf5a865de3
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

{"balance":5,"currency":"credits","accountId":"acc_2e023596-1fee-48b1-bbb4-66f113920e76"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2a35ca70-abb6-4b3c-aac1-420319bb2b49

--- request headers ---
Accept: application/json
Idempotency-Key: qa-28690421b87d4de9b4755f839ff751ab
X-Correlation-Id: qa-2a35ca70-abb6-4b3c-aac1-420319bb2b49
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a35ca70-abb6-4b3c-aac1-420319bb2b49
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
Location: /v1/credits/purchases/pur_cd085d9d-90d3-4f21-ae55-0935fc45ec6d
Content-Length: 144

{"id":"pur_cd085d9d-90d3-4f21-ae55-0935fc45ec6d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:37.487575520Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-de6530f5-dece-49dc-969f-6247a9519878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de6530f5-dece-49dc-969f-6247a9519878
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-de6530f5-dece-49dc-969f-6247a9519878
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

{"items":[{"id":"led_d078ba3c-636e-4c88-bc6a-1f8b6f974459","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:37.443241617Z"},{"id":"led_6bb58034-62af-4681-95f2-ee234851f775","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_cd085d9d-90d3-4f21-ae55-0935fc45ec6d","createdAt":"2026-10-31T08:31:37.487575520Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2247676f-4789-43d2-a182-54f3cff179c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2247676f-4789-43d2-a182-54f3cff179c0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2247676f-4789-43d2-a182-54f3cff179c0
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
correlation: qa-d2d31669-5931-46a7-b0ea-6c1ec9af8cc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d31669-5931-46a7-b0ea-6c1ec9af8cc8
Content-Type: application/json

--- request body ---
{"handle":"qa-39330e0ea46e","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2d31669-5931-46a7-b0ea-6c1ec9af8cc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2d31669-5931-46a7-b0ea-6c1ec9af8cc8"}
```
