# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 333 | `qa-2ceb1b87-92dd-45a7-9087-8c1b6846d31b` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-2a01073f-ecdc-4bb6-bede-ddaa8710998a` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-6ca6c90d-a35b-47ca-b84e-6db41c745fe2` |
| 4 | `POST /v1/credits/purchases` | 201 | 45 | `qa-11a9eb9c-e74f-4128-9cb7-99ea745f9acf` |
| 5 | `POST /v1/auth/token` | 200 | 23 | `qa-5ba3b7e4-c34a-4f0b-850f-54986a75e831` |
| 6 | `POST /v1/credits/purchases` | 201 | 9 | `qa-00cd0a91-4deb-45b0-b7b2-0920c82f753e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-eabe8e08-b49a-4ccf-834c-85f495a30216` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-a90cb38d-2393-49fd-b96f-807ca77af31a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-963ed5c2-8cc4-4970-9918-0576c97dc900` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-39ba5c45-83ec-4dea-a25f-25f302df59fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ceb1b87-92dd-45a7-9087-8c1b6846d31b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ceb1b87-92dd-45a7-9087-8c1b6846d31b
Content-Type: application/json

--- request body ---
{"handle":"qa-0bc19850badf","displayName":"QA 0bc19850badf","password":"****","region":"eu"}

--- response: 201 in 333 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ceb1b87-92dd-45a7-9087-8c1b6846d31b
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
Location: /v1/accounts/qa-0bc19850badf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b55b82a5-bad6-4ca6-82e3-3a8d8372de96","handle":"qa-0bc19850badf","displayName":"QA 0bc19850badf","region":"eu","role":"user","createdAt":"2026-11-28T10:37:12.209641863Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2a01073f-ecdc-4bb6-bede-ddaa8710998a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a01073f-ecdc-4bb6-bede-ddaa8710998a
Content-Type: application/json

--- request body ---
{"handle":"qa-f995bb3fd6d4","displayName":"QA f995bb3fd6d4","password":"****","region":"us"}

--- response: 201 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a01073f-ecdc-4bb6-bede-ddaa8710998a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-f995bb3fd6d4
X-Served-Region: us
Content-Length: 181

{"id":"acc_cb34d1dc-bd4d-4bc8-8fec-5fdf54ccb0d8","handle":"qa-f995bb3fd6d4","displayName":"QA f995bb3fd6d4","region":"us","role":"user","createdAt":"2026-11-28T10:37:12.562465963Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ca6c90d-a35b-47ca-b84e-6db41c745fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca6c90d-a35b-47ca-b84e-6db41c745fe2
Content-Type: application/json

--- request body ---
{"handle":"qa-0bc19850badf","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca6c90d-a35b-47ca-b84e-6db41c745fe2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b55b82a5-bad6-4ca6-82e3-3a8d8372de96"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-11a9eb9c-e74f-4128-9cb7-99ea745f9acf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-84966b1b35554629bf17deedd1975a5e
X-Correlation-Id: qa-11a9eb9c-e74f-4128-9cb7-99ea745f9acf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-11a9eb9c-e74f-4128-9cb7-99ea745f9acf
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
Location: /v1/credits/purchases/pur_db383257-8bd2-44aa-91cc-6760345e2639
Content-Length: 144

{"id":"pur_db383257-8bd2-44aa-91cc-6760345e2639","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.697408621Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5ba3b7e4-c34a-4f0b-850f-54986a75e831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ba3b7e4-c34a-4f0b-850f-54986a75e831
Content-Type: application/json

--- request body ---
{"handle":"qa-f995bb3fd6d4","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ba3b7e4-c34a-4f0b-850f-54986a75e831
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb34d1dc-bd4d-4bc8-8fec-5fdf54ccb0d8"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-00cd0a91-4deb-45b0-b7b2-0920c82f753e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-84966b1b35554629bf17deedd1975a5e
X-Correlation-Id: qa-00cd0a91-4deb-45b0-b7b2-0920c82f753e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-00cd0a91-4deb-45b0-b7b2-0920c82f753e
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_e6f3905b-4521-4afd-922a-832071922d90
Content-Length: 144

{"id":"pur_e6f3905b-4521-4afd-922a-832071922d90","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.788360898Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eabe8e08-b49a-4ccf-834c-85f495a30216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eabe8e08-b49a-4ccf-834c-85f495a30216
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eabe8e08-b49a-4ccf-834c-85f495a30216
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a90cb38d-2393-49fd-b96f-807ca77af31a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a90cb38d-2393-49fd-b96f-807ca77af31a
Content-Type: application/json

--- request body ---
{"handle":"qa-f995bb3fd6d4","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a90cb38d-2393-49fd-b96f-807ca77af31a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a90cb38d-2393-49fd-b96f-807ca77af31a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-963ed5c2-8cc4-4970-9918-0576c97dc900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963ed5c2-8cc4-4970-9918-0576c97dc900
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-963ed5c2-8cc4-4970-9918-0576c97dc900
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-39ba5c45-83ec-4dea-a25f-25f302df59fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39ba5c45-83ec-4dea-a25f-25f302df59fd
Content-Type: application/json

--- request body ---
{"handle":"qa-0bc19850badf","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39ba5c45-83ec-4dea-a25f-25f302df59fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39ba5c45-83ec-4dea-a25f-25f302df59fd"}
```
