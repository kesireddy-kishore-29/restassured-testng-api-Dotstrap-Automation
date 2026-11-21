# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-b7a7077c-859a-4cba-80c7-091d841cf31e` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-7f37ff61-4fc5-47c3-893f-1d4979e12190` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-dcb981d3-db3a-42f1-b139-06b490da1956` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-466b1f67-49f1-4ab2-991c-6f8308e98b16` |
| 5 | `POST /v1/credits/purchases` | 415 | 14 | `qa-3e07437c-ab70-44f0-a92e-e73301022717` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-5c54c778-67fd-4308-ab5c-6d5abbf8ab05` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e645574c-eb74-40b3-8fd0-9df3a678401b` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-aceb6b3f-ddf0-4e82-9452-b39206e8e6a7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-317fa3d7-19fc-4c98-8e2c-623ac18b5d05` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-44df2bdb-02cd-4db3-a7df-26569e63f86b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7a7077c-859a-4cba-80c7-091d841cf31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7a7077c-859a-4cba-80c7-091d841cf31e
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb9d69a1597","displayName":"QA cbb9d69a1597","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7a7077c-859a-4cba-80c7-091d841cf31e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Location: /v1/accounts/qa-cbb9d69a1597
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da47b3c4-c93c-4f17-856e-4f2e2a083f8c","handle":"qa-cbb9d69a1597","displayName":"QA cbb9d69a1597","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.654625822Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f37ff61-4fc5-47c3-893f-1d4979e12190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f37ff61-4fc5-47c3-893f-1d4979e12190
Content-Type: application/json

--- request body ---
{"handle":"qa-3675c843ec3b","displayName":"QA 3675c843ec3b","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f37ff61-4fc5-47c3-893f-1d4979e12190
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Location: /v1/accounts/qa-3675c843ec3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_027a7d5c-3384-408a-b812-352acdbc4ca4","handle":"qa-3675c843ec3b","displayName":"QA 3675c843ec3b","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.687980941Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dcb981d3-db3a-42f1-b139-06b490da1956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcb981d3-db3a-42f1-b139-06b490da1956
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb9d69a1597","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcb981d3-db3a-42f1-b139-06b490da1956
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da47b3c4-c93c-4f17-856e-4f2e2a083f8c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-466b1f67-49f1-4ab2-991c-6f8308e98b16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466b1f67-49f1-4ab2-991c-6f8308e98b16
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3675c843ec3b","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-466b1f67-49f1-4ab2-991c-6f8308e98b16
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
Location: /v1/conversations/cnv_5c767fab-9c59-4ca6-b3ba-6203f7047c48
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5c767fab-9c59-4ca6-b3ba-6203f7047c48","subject":"Error contract","status":"open","region":"eu","participants":["qa-cbb9d69a1597","qa-3675c843ec3b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.753428560Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3e07437c-ab70-44f0-a92e-e73301022717

--- request headers ---
Accept: application/json
Idempotency-Key: qa-015e745243d14590a1b6feff783f1187
X-Correlation-Id: qa-3e07437c-ab70-44f0-a92e-e73301022717
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e07437c-ab70-44f0-a92e-e73301022717
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-3e07437c-ab70-44f0-a92e-e73301022717"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c54c778-67fd-4308-ab5c-6d5abbf8ab05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c54c778-67fd-4308-ab5c-6d5abbf8ab05
Content-Type: application/json

--- request body ---
{"handle":"qa-3675c843ec3b","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c54c778-67fd-4308-ab5c-6d5abbf8ab05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_027a7d5c-3384-408a-b812-352acdbc4ca4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e645574c-eb74-40b3-8fd0-9df3a678401b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e645574c-eb74-40b3-8fd0-9df3a678401b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e645574c-eb74-40b3-8fd0-9df3a678401b
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-aceb6b3f-ddf0-4e82-9452-b39206e8e6a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aceb6b3f-ddf0-4e82-9452-b39206e8e6a7
Content-Type: application/json

--- request body ---
{"handle":"qa-3675c843ec3b","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aceb6b3f-ddf0-4e82-9452-b39206e8e6a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aceb6b3f-ddf0-4e82-9452-b39206e8e6a7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-317fa3d7-19fc-4c98-8e2c-623ac18b5d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317fa3d7-19fc-4c98-8e2c-623ac18b5d05
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-317fa3d7-19fc-4c98-8e2c-623ac18b5d05
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
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-44df2bdb-02cd-4db3-a7df-26569e63f86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44df2bdb-02cd-4db3-a7df-26569e63f86b
Content-Type: application/json

--- request body ---
{"handle":"qa-cbb9d69a1597","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44df2bdb-02cd-4db3-a7df-26569e63f86b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44df2bdb-02cd-4db3-a7df-26569e63f86b"}
```
