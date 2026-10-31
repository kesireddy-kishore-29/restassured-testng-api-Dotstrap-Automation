# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-08685c97-1c69-4a17-9907-b66993e90bbc` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-2c2f25b5-cd73-4283-95f6-6f4d626c9d9e` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 44 | `qa-14323d02-347a-4397-bbea-e5d441c709db` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e8115551-2df8-446e-b15c-76d9a091ea19` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-4d9451f2-a09a-467f-9d12-00d2b1fa093f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08685c97-1c69-4a17-9907-b66993e90bbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08685c97-1c69-4a17-9907-b66993e90bbc
Content-Type: application/json

--- request body ---
{"handle":"qa-d03c81f91c68","displayName":"QA d03c81f91c68","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-08685c97-1c69-4a17-9907-b66993e90bbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-d03c81f91c68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e81bd81-dddc-48a2-81ae-b96fe603f5a8","handle":"qa-d03c81f91c68","displayName":"QA d03c81f91c68","region":"eu","role":"user","createdAt":"2026-10-26T07:54:49.122832392Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2c2f25b5-cd73-4283-95f6-6f4d626c9d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2f25b5-cd73-4283-95f6-6f4d626c9d9e
Content-Type: application/json

--- request body ---
{"handle":"qa-d03c81f91c68","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c2f25b5-cd73-4283-95f6-6f4d626c9d9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e81bd81-dddc-48a2-81ae-b96fe603f5a8"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-14323d02-347a-4397-bbea-e5d441c709db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14323d02-347a-4397-bbea-e5d441c709db
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 44 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14323d02-347a-4397-bbea-e5d441c709db
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-14323d02-347a-4397-bbea-e5d441c709db"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8115551-2df8-446e-b15c-76d9a091ea19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8115551-2df8-446e-b15c-76d9a091ea19
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8115551-2df8-446e-b15c-76d9a091ea19
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4d9451f2-a09a-467f-9d12-00d2b1fa093f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d9451f2-a09a-467f-9d12-00d2b1fa093f
Content-Type: application/json

--- request body ---
{"handle":"qa-d03c81f91c68","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d9451f2-a09a-467f-9d12-00d2b1fa093f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d9451f2-a09a-467f-9d12-00d2b1fa093f"}
```
