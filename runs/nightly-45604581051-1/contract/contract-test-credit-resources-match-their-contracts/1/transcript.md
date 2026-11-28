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
| 1 | `POST /v1/accounts` | 201 | 327 | `qa-f606f021-cba5-4518-869c-a90526f4dee4` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-a1a3c58a-2db6-4dd3-a0a3-baf95736d237` |
| 3 | `GET /v1/credits/balance` | 200 | 41 | `qa-b3493415-ca70-43cb-b876-db685cdaa3a0` |
| 4 | `POST /v1/credits/purchases` | 201 | 19 | `qa-acd0cce1-35e0-451c-ac73-af93eae0839a` |
| 5 | `GET /v1/credits/ledger` | 200 | 41 | `qa-fe64157e-4cd8-434e-9251-c13f8ada3ce1` |
| 6 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-bca138c7-4b62-4f3c-ac33-139e727b6832` |
| 7 | `POST /v1/auth/token` | 401 | 16 | `qa-476407fb-039d-4818-b119-d550a50a05df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f606f021-cba5-4518-869c-a90526f4dee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f606f021-cba5-4518-869c-a90526f4dee4
Content-Type: application/json

--- request body ---
{"handle":"qa-192e73c5758b","displayName":"QA 192e73c5758b","password":"****","region":"in"}

--- response: 201 in 327 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f606f021-cba5-4518-869c-a90526f4dee4
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
Location: /v1/accounts/qa-192e73c5758b
X-Served-Region: in
Content-Length: 181

{"id":"acc_863cf2cc-c4ef-47b8-b556-e5f9e00cbf4d","handle":"qa-192e73c5758b","displayName":"QA 192e73c5758b","region":"in","role":"user","createdAt":"2026-11-25T11:27:56.398422107Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a1a3c58a-2db6-4dd3-a0a3-baf95736d237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1a3c58a-2db6-4dd3-a0a3-baf95736d237
Content-Type: application/json

--- request body ---
{"handle":"qa-192e73c5758b","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1a3c58a-2db6-4dd3-a0a3-baf95736d237
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_863cf2cc-c4ef-47b8-b556-e5f9e00cbf4d"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-b3493415-ca70-43cb-b876-db685cdaa3a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3493415-ca70-43cb-b876-db685cdaa3a0
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3493415-ca70-43cb-b876-db685cdaa3a0
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

{"balance":5,"currency":"credits","accountId":"acc_863cf2cc-c4ef-47b8-b556-e5f9e00cbf4d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-acd0cce1-35e0-451c-ac73-af93eae0839a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-69949dc55fc74eec8f4fcc7fdcfda7be
X-Correlation-Id: qa-acd0cce1-35e0-451c-ac73-af93eae0839a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-acd0cce1-35e0-451c-ac73-af93eae0839a
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
Location: /v1/credits/purchases/pur_6bb5f397-4a29-4a47-a7b1-ee3eeb3c1df3
Content-Length: 144

{"id":"pur_6bb5f397-4a29-4a47-a7b1-ee3eeb3c1df3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:56.861905780Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fe64157e-4cd8-434e-9251-c13f8ada3ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe64157e-4cd8-434e-9251-c13f8ada3ce1
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe64157e-4cd8-434e-9251-c13f8ada3ce1
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

{"items":[{"id":"led_b061afb0-96e5-47a9-9df6-189c7384b012","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:27:56.398435421Z"},{"id":"led_8f68e18a-46bd-4fbf-bc62-63cc9ce49401","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6bb5f397-4a29-4a47-a7b1-ee3eeb3c1df3","createdAt":"2026-11-25T11:27:56.861905780Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bca138c7-4b62-4f3c-ac33-139e727b6832

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca138c7-4b62-4f3c-ac33-139e727b6832
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bca138c7-4b62-4f3c-ac33-139e727b6832
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
correlation: qa-476407fb-039d-4818-b119-d550a50a05df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-476407fb-039d-4818-b119-d550a50a05df
Content-Type: application/json

--- request body ---
{"handle":"qa-192e73c5758b","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-476407fb-039d-4818-b119-d550a50a05df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-476407fb-039d-4818-b119-d550a50a05df"}
```
