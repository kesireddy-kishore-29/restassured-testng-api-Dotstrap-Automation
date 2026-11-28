# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-0dd0db42-0d2c-4586-864d-dd46b7fb43c5` |
| 2 | `POST /v1/accounts` | 201 | 6 | `qa-38cf7afd-f94f-4fae-98d1-81e0ea3eb37c` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-faaf9fc5-a11b-447f-a3ed-0009d4ded544` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-e8dba788-31b5-4268-83d5-04e09c65f915` |
| 5 | `POST /v1/credits/purchases` | 400 | 11 | `qa-af5d16ad-ca7c-45d9-939f-7eba81df5989` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-eed8f4a4-cf74-4ab0-97c2-971a8b1c2329` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-095e22b6-c915-45d5-a0bb-5df129c291df` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-9ba7e254-ed50-4dc9-a8b2-68044109b0bf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-03940834-6b28-450f-9eb7-6637ef955eff` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-631206f5-df64-4036-872b-c1883eacb635` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0dd0db42-0d2c-4586-864d-dd46b7fb43c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dd0db42-0d2c-4586-864d-dd46b7fb43c5
Content-Type: application/json

--- request body ---
{"handle":"qa-df6ec473d75b","displayName":"QA df6ec473d75b","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dd0db42-0d2c-4586-864d-dd46b7fb43c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Location: /v1/accounts/qa-df6ec473d75b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9fdd513f-8424-4491-9796-dba47016cc52","handle":"qa-df6ec473d75b","displayName":"QA df6ec473d75b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.249098846Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-38cf7afd-f94f-4fae-98d1-81e0ea3eb37c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38cf7afd-f94f-4fae-98d1-81e0ea3eb37c
Content-Type: application/json

--- request body ---
{"handle":"qa-5377eed84abd","displayName":"QA 5377eed84abd","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-38cf7afd-f94f-4fae-98d1-81e0ea3eb37c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Location: /v1/accounts/qa-5377eed84abd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75b75629-c4b3-4ae1-8da6-558fbda3ed64","handle":"qa-5377eed84abd","displayName":"QA 5377eed84abd","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.267185877Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-faaf9fc5-a11b-447f-a3ed-0009d4ded544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faaf9fc5-a11b-447f-a3ed-0009d4ded544
Content-Type: application/json

--- request body ---
{"handle":"qa-df6ec473d75b","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-faaf9fc5-a11b-447f-a3ed-0009d4ded544
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9fdd513f-8424-4491-9796-dba47016cc52"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e8dba788-31b5-4268-83d5-04e09c65f915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8dba788-31b5-4268-83d5-04e09c65f915
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5377eed84abd","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8dba788-31b5-4268-83d5-04e09c65f915
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
Location: /v1/conversations/cnv_a2979fd8-22d5-4cf0-9ad1-acd7a7997b3b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a2979fd8-22d5-4cf0-9ad1-acd7a7997b3b","subject":"Error contract","status":"open","region":"eu","participants":["qa-df6ec473d75b","qa-5377eed84abd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.309768801Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-af5d16ad-ca7c-45d9-939f-7eba81df5989

--- request headers ---
Accept: application/json
Idempotency-Key: qa-370865bb4f8a4c71917292a6816a6db7
X-Correlation-Id: qa-af5d16ad-ca7c-45d9-939f-7eba81df5989
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af5d16ad-ca7c-45d9-939f-7eba81df5989
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-af5d16ad-ca7c-45d9-939f-7eba81df5989"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eed8f4a4-cf74-4ab0-97c2-971a8b1c2329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed8f4a4-cf74-4ab0-97c2-971a8b1c2329
Content-Type: application/json

--- request body ---
{"handle":"qa-5377eed84abd","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-eed8f4a4-cf74-4ab0-97c2-971a8b1c2329
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75b75629-c4b3-4ae1-8da6-558fbda3ed64"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-095e22b6-c915-45d5-a0bb-5df129c291df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-095e22b6-c915-45d5-a0bb-5df129c291df
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-095e22b6-c915-45d5-a0bb-5df129c291df
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
correlation: qa-9ba7e254-ed50-4dc9-a8b2-68044109b0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba7e254-ed50-4dc9-a8b2-68044109b0bf
Content-Type: application/json

--- request body ---
{"handle":"qa-5377eed84abd","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ba7e254-ed50-4dc9-a8b2-68044109b0bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ba7e254-ed50-4dc9-a8b2-68044109b0bf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03940834-6b28-450f-9eb7-6637ef955eff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03940834-6b28-450f-9eb7-6637ef955eff
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03940834-6b28-450f-9eb7-6637ef955eff
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
correlation: qa-631206f5-df64-4036-872b-c1883eacb635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-631206f5-df64-4036-872b-c1883eacb635
Content-Type: application/json

--- request body ---
{"handle":"qa-df6ec473d75b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-631206f5-df64-4036-872b-c1883eacb635
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-631206f5-df64-4036-872b-c1883eacb635"}
```
