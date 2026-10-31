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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-5824485f-aac6-4194-b00d-bcfdb5321397` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-090ab37c-7cd1-434d-adef-a3ad21ece1df` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-82a44d2f-1c0f-4165-bf22-9e042c33366c` |
| 4 | `POST /v1/credits/purchases` | 201 | 6 | `qa-bcfb4b0b-b90f-4105-a022-c16b9fc16afc` |
| 5 | `POST /v1/auth/token` | 200 | 11 | `qa-5cf5b24a-1124-44bc-91e2-9ae9a1abd56e` |
| 6 | `POST /v1/credits/purchases` | 201 | 6 | `qa-b219bd9e-e3f5-4b5e-8b40-6316f72534a9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5fc7af49-1a2d-43a3-9ba4-d91dfe9a406a` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-b1b21e69-372f-4d56-8e68-42ebe25452b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4d5125d7-9bc4-4357-8be9-2bf61ff7e71b` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-c3b221af-e4f6-4031-8224-73827ec3aa42` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5824485f-aac6-4194-b00d-bcfdb5321397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5824485f-aac6-4194-b00d-bcfdb5321397
Content-Type: application/json

--- request body ---
{"handle":"qa-78c86d7038ba","displayName":"QA 78c86d7038ba","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-5824485f-aac6-4194-b00d-bcfdb5321397
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 8
Location: /v1/accounts/qa-78c86d7038ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2dedf1a3-db6b-4567-b6ea-55964149fe1a","handle":"qa-78c86d7038ba","displayName":"QA 78c86d7038ba","region":"eu","role":"user","createdAt":"2026-10-23T07:41:16.880522193Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-090ab37c-7cd1-434d-adef-a3ad21ece1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090ab37c-7cd1-434d-adef-a3ad21ece1df
Content-Type: application/json

--- request body ---
{"handle":"qa-d597fdb95801","displayName":"QA d597fdb95801","password":"****","region":"us"}

--- response: 201 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-090ab37c-7cd1-434d-adef-a3ad21ece1df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Location: /v1/accounts/qa-d597fdb95801
X-Served-Region: us
Content-Length: 181

{"id":"acc_86737747-3383-44b8-95c2-d91dab934584","handle":"qa-d597fdb95801","displayName":"QA d597fdb95801","region":"us","role":"user","createdAt":"2026-10-23T07:41:16.907742672Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-82a44d2f-1c0f-4165-bf22-9e042c33366c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82a44d2f-1c0f-4165-bf22-9e042c33366c
Content-Type: application/json

--- request body ---
{"handle":"qa-78c86d7038ba","password":"****"}

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-82a44d2f-1c0f-4165-bf22-9e042c33366c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2dedf1a3-db6b-4567-b6ea-55964149fe1a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bcfb4b0b-b90f-4105-a022-c16b9fc16afc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-66ff6a701742418682241e68a187bd8e
X-Correlation-Id: qa-bcfb4b0b-b90f-4105-a022-c16b9fc16afc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcfb4b0b-b90f-4105-a022-c16b9fc16afc
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
Location: /v1/credits/purchases/pur_b5d77656-87c1-4922-bc36-b8165197120a
Content-Length: 144

{"id":"pur_b5d77656-87c1-4922-bc36-b8165197120a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:16.939201591Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5cf5b24a-1124-44bc-91e2-9ae9a1abd56e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cf5b24a-1124-44bc-91e2-9ae9a1abd56e
Content-Type: application/json

--- request body ---
{"handle":"qa-d597fdb95801","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cf5b24a-1124-44bc-91e2-9ae9a1abd56e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86737747-3383-44b8-95c2-d91dab934584"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b219bd9e-e3f5-4b5e-8b40-6316f72534a9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-66ff6a701742418682241e68a187bd8e
X-Correlation-Id: qa-b219bd9e-e3f5-4b5e-8b40-6316f72534a9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b219bd9e-e3f5-4b5e-8b40-6316f72534a9
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
Location: /v1/credits/purchases/pur_145f5ede-6bb5-4a95-a344-009310a207de
Content-Length: 144

{"id":"pur_145f5ede-6bb5-4a95-a344-009310a207de","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:16.971343681Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fc7af49-1a2d-43a3-9ba4-d91dfe9a406a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc7af49-1a2d-43a3-9ba4-d91dfe9a406a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fc7af49-1a2d-43a3-9ba4-d91dfe9a406a
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
correlation: qa-b1b21e69-372f-4d56-8e68-42ebe25452b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1b21e69-372f-4d56-8e68-42ebe25452b9
Content-Type: application/json

--- request body ---
{"handle":"qa-d597fdb95801","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1b21e69-372f-4d56-8e68-42ebe25452b9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1b21e69-372f-4d56-8e68-42ebe25452b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d5125d7-9bc4-4357-8be9-2bf61ff7e71b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d5125d7-9bc4-4357-8be9-2bf61ff7e71b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d5125d7-9bc4-4357-8be9-2bf61ff7e71b
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
correlation: qa-c3b221af-e4f6-4031-8224-73827ec3aa42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3b221af-e4f6-4031-8224-73827ec3aa42
Content-Type: application/json

--- request body ---
{"handle":"qa-78c86d7038ba","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3b221af-e4f6-4031-8224-73827ec3aa42
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3b221af-e4f6-4031-8224-73827ec3aa42"}
```
