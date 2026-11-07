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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-80166293-a9f1-4388-a0dd-ad0d8d63f6af` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-7c0ab9ec-d29f-48cc-b070-ed29e32aebc5` |
| 3 | `GET /v1/credits/balance` | 200 | 13 | `qa-4dd05eae-32bd-4188-b903-f69a686efe89` |
| 4 | `POST /v1/credits/purchases` | 201 | 18 | `qa-7f23f2e6-ee4b-4684-998c-145fa7f05430` |
| 5 | `GET /v1/credits/ledger` | 200 | 9 | `qa-3cfecfc2-ffb3-4da8-98d9-b54bb2cccb11` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0e9a9274-29b1-4528-8b75-d9e9c4b51413` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-9839f18b-98c6-4a9b-be91-33c467a42947` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-80166293-a9f1-4388-a0dd-ad0d8d63f6af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80166293-a9f1-4388-a0dd-ad0d8d63f6af
Content-Type: application/json

--- request body ---
{"handle":"qa-49669685bc7a","displayName":"QA 49669685bc7a","password":"****","region":"in"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-80166293-a9f1-4388-a0dd-ad0d8d63f6af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 5
Location: /v1/accounts/qa-49669685bc7a
X-Served-Region: in
Content-Length: 181

{"id":"acc_bf7858d0-9fb2-4304-aaaa-1db387ec0fb4","handle":"qa-49669685bc7a","displayName":"QA 49669685bc7a","region":"in","role":"user","createdAt":"2026-10-30T08:46:06.492704637Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7c0ab9ec-d29f-48cc-b070-ed29e32aebc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0ab9ec-d29f-48cc-b070-ed29e32aebc5
Content-Type: application/json

--- request body ---
{"handle":"qa-49669685bc7a","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c0ab9ec-d29f-48cc-b070-ed29e32aebc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf7858d0-9fb2-4304-aaaa-1db387ec0fb4"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-4dd05eae-32bd-4188-b903-f69a686efe89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dd05eae-32bd-4188-b903-f69a686efe89
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dd05eae-32bd-4188-b903-f69a686efe89
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

{"balance":5,"currency":"credits","accountId":"acc_bf7858d0-9fb2-4304-aaaa-1db387ec0fb4"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7f23f2e6-ee4b-4684-998c-145fa7f05430

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a3f87e6d899f4833ad9e0c6c95b98086
X-Correlation-Id: qa-7f23f2e6-ee4b-4684-998c-145fa7f05430
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f23f2e6-ee4b-4684-998c-145fa7f05430
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
Location: /v1/credits/purchases/pur_e84052e7-c3c6-4f8e-b402-cfa6c2b15e73
Content-Length: 144

{"id":"pur_e84052e7-c3c6-4f8e-b402-cfa6c2b15e73","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:46:06.559032774Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3cfecfc2-ffb3-4da8-98d9-b54bb2cccb11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cfecfc2-ffb3-4da8-98d9-b54bb2cccb11
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cfecfc2-ffb3-4da8-98d9-b54bb2cccb11
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

{"items":[{"id":"led_28c9390e-13f6-48b2-9999-0e4355bf3c95","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:46:06.492722723Z"},{"id":"led_58ad0c0f-8574-41b1-88c4-fa5d7ad2244f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_e84052e7-c3c6-4f8e-b402-cfa6c2b15e73","createdAt":"2026-10-30T08:46:06.559032774Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e9a9274-29b1-4528-8b75-d9e9c4b51413

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e9a9274-29b1-4528-8b75-d9e9c4b51413
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e9a9274-29b1-4528-8b75-d9e9c4b51413
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
correlation: qa-9839f18b-98c6-4a9b-be91-33c467a42947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9839f18b-98c6-4a9b-be91-33c467a42947
Content-Type: application/json

--- request body ---
{"handle":"qa-49669685bc7a","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9839f18b-98c6-4a9b-be91-33c467a42947
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9839f18b-98c6-4a9b-be91-33c467a42947"}
```
