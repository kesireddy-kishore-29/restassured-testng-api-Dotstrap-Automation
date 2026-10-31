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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-e23851f2-afdd-4eb6-ba98-7c13123a91c7` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-920eeb43-0ae8-4310-99b2-7494d66209df` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-e0fa3f84-ddb8-40fb-9b60-06df847c7da2` |
| 4 | `POST /v1/credits/purchases` | 201 | 6 | `qa-b7d4408c-b0b0-4151-9491-bd1ef18ac0ca` |
| 5 | `POST /v1/auth/token` | 200 | 10 | `qa-e30d9715-0337-457c-acda-95c90e4bd47c` |
| 6 | `POST /v1/credits/purchases` | 201 | 6 | `qa-077272ed-6846-498b-8502-2de83551b067` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e3334cd8-4aa3-479b-9ebc-f4836fbe9f3b` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-417e3aa7-1a79-4577-ab9a-326aa4c1f1af` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-2b78754a-fdff-4a91-82b0-096fac73b002` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-759cf26b-e71e-4299-a2b7-ac95c2f8f902` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e23851f2-afdd-4eb6-ba98-7c13123a91c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e23851f2-afdd-4eb6-ba98-7c13123a91c7
Content-Type: application/json

--- request body ---
{"handle":"qa-074ca6875390","displayName":"QA 074ca6875390","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e23851f2-afdd-4eb6-ba98-7c13123a91c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-074ca6875390
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5653d89-67c6-456a-8d1a-88265c514b10","handle":"qa-074ca6875390","displayName":"QA 074ca6875390","region":"eu","role":"user","createdAt":"2026-10-24T07:25:07.396101330Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-920eeb43-0ae8-4310-99b2-7494d66209df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-920eeb43-0ae8-4310-99b2-7494d66209df
Content-Type: application/json

--- request body ---
{"handle":"qa-f426861b7caa","displayName":"QA f426861b7caa","password":"****","region":"us"}

--- response: 201 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-920eeb43-0ae8-4310-99b2-7494d66209df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-f426861b7caa
X-Served-Region: us
Content-Length: 181

{"id":"acc_2aff45a1-1b20-4d2b-ae93-4766ac48b01b","handle":"qa-f426861b7caa","displayName":"QA f426861b7caa","region":"us","role":"user","createdAt":"2026-10-24T07:25:07.411026083Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e0fa3f84-ddb8-40fb-9b60-06df847c7da2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0fa3f84-ddb8-40fb-9b60-06df847c7da2
Content-Type: application/json

--- request body ---
{"handle":"qa-074ca6875390","password":"****"}

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0fa3f84-ddb8-40fb-9b60-06df847c7da2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5653d89-67c6-456a-8d1a-88265c514b10"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b7d4408c-b0b0-4151-9491-bd1ef18ac0ca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2f104243413841c1b279c5cbe3e131b4
X-Correlation-Id: qa-b7d4408c-b0b0-4151-9491-bd1ef18ac0ca
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7d4408c-b0b0-4151-9491-bd1ef18ac0ca
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
Location: /v1/credits/purchases/pur_eeefe073-2fa7-4d83-a389-b2f25764e7b2
Content-Length: 144

{"id":"pur_eeefe073-2fa7-4d83-a389-b2f25764e7b2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:07.436081772Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e30d9715-0337-457c-acda-95c90e4bd47c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e30d9715-0337-457c-acda-95c90e4bd47c
Content-Type: application/json

--- request body ---
{"handle":"qa-f426861b7caa","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e30d9715-0337-457c-acda-95c90e4bd47c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2aff45a1-1b20-4d2b-ae93-4766ac48b01b"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-077272ed-6846-498b-8502-2de83551b067

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2f104243413841c1b279c5cbe3e131b4
X-Correlation-Id: qa-077272ed-6846-498b-8502-2de83551b067
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-077272ed-6846-498b-8502-2de83551b067
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
Location: /v1/credits/purchases/pur_faacd6b7-b5a8-4b53-a29e-064de9b9064f
Content-Length: 144

{"id":"pur_faacd6b7-b5a8-4b53-a29e-064de9b9064f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:07.465700473Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3334cd8-4aa3-479b-9ebc-f4836fbe9f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3334cd8-4aa3-479b-9ebc-f4836fbe9f3b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3334cd8-4aa3-479b-9ebc-f4836fbe9f3b
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
correlation: qa-417e3aa7-1a79-4577-ab9a-326aa4c1f1af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-417e3aa7-1a79-4577-ab9a-326aa4c1f1af
Content-Type: application/json

--- request body ---
{"handle":"qa-f426861b7caa","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-417e3aa7-1a79-4577-ab9a-326aa4c1f1af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-417e3aa7-1a79-4577-ab9a-326aa4c1f1af"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b78754a-fdff-4a91-82b0-096fac73b002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b78754a-fdff-4a91-82b0-096fac73b002
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b78754a-fdff-4a91-82b0-096fac73b002
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
correlation: qa-759cf26b-e71e-4299-a2b7-ac95c2f8f902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-759cf26b-e71e-4299-a2b7-ac95c2f8f902
Content-Type: application/json

--- request body ---
{"handle":"qa-074ca6875390","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-759cf26b-e71e-4299-a2b7-ac95c2f8f902
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-759cf26b-e71e-4299-a2b7-ac95c2f8f902"}
```
