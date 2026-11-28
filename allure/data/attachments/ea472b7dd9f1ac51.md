# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-e666d438-ee93-4e82-9441-7a74c17e25f9` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-1b7ff9fa-fe97-474c-9e0c-25e6dcee317f` |
| 3 | `POST /v1/accounts` | 201 | 43 | `qa-82ee7c35-687f-43d3-9048-13e892bf4529` |
| 4 | `POST /v1/auth/token` | 200 | 55 | `qa-4318faba-d051-4797-b63c-2f4dc4317a7a` |
| 5 | `POST /v1/conversations` | 201 | 25 | `qa-d28380c7-8220-4ddb-b963-7bc152b9c991` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-05c3d21a-299c-42c2-8b3f-1a8bb86743e0` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 14 | `qa-89cbaa82-ad3b-4541-a810-2838bd7b65cb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-7d977db0-2926-44ca-a886-05d2edd49257` |
| 9 | `POST /v1/auth/token` | 401 | 32 | `qa-d887241b-3d83-43d3-8db2-dcfb6b5d4de5` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-36764ac2-c381-495a-b0d9-96d7197efff9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-fd8fc9f9-cd94-4b7c-8a3a-3bdc638bf21c` |
| 12 | `POST /v1/auth/token` | 401 | 40 | `qa-a6d42fed-a201-4a32-99bb-4d3b8b5e2abc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-1863c0e5-48f1-49c7-8d51-11006f3692a2` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-a8773ce6-3fd0-44a3-9a7e-a997ecc67ef5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e666d438-ee93-4e82-9441-7a74c17e25f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e666d438-ee93-4e82-9441-7a74c17e25f9
Content-Type: application/json

--- request body ---
{"handle":"qa-f65b0171f341","displayName":"QA f65b0171f341","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e666d438-ee93-4e82-9441-7a74c17e25f9
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
Location: /v1/accounts/qa-f65b0171f341
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1285fde2-22c0-4612-a950-f3206bf52f79","handle":"qa-f65b0171f341","displayName":"QA f65b0171f341","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.594465396Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1b7ff9fa-fe97-474c-9e0c-25e6dcee317f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7ff9fa-fe97-474c-9e0c-25e6dcee317f
Content-Type: application/json

--- request body ---
{"handle":"qa-2e863709d1c8","displayName":"QA 2e863709d1c8","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b7ff9fa-fe97-474c-9e0c-25e6dcee317f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Location: /v1/accounts/qa-2e863709d1c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56ed37eb-3df6-49b7-9a55-13fd3ffcfc59","handle":"qa-2e863709d1c8","displayName":"QA 2e863709d1c8","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.659873160Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-82ee7c35-687f-43d3-9048-13e892bf4529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ee7c35-687f-43d3-9048-13e892bf4529
Content-Type: application/json

--- request body ---
{"handle":"qa-4edbc17a8780","displayName":"QA 4edbc17a8780","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-82ee7c35-687f-43d3-9048-13e892bf4529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Location: /v1/accounts/qa-4edbc17a8780
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f2dcc70-ad9b-41a5-9e4b-aa66856350d5","handle":"qa-4edbc17a8780","displayName":"QA 4edbc17a8780","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.731338873Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4318faba-d051-4797-b63c-2f4dc4317a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4318faba-d051-4797-b63c-2f4dc4317a7a
Content-Type: application/json

--- request body ---
{"handle":"qa-f65b0171f341","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-4318faba-d051-4797-b63c-2f4dc4317a7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1285fde2-22c0-4612-a950-f3206bf52f79"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d28380c7-8220-4ddb-b963-7bc152b9c991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d28380c7-8220-4ddb-b963-7bc152b9c991
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2e863709d1c8","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-d28380c7-8220-4ddb-b963-7bc152b9c991
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
Location: /v1/conversations/cnv_36bebea6-bd10-4d4b-b0f0-dbc7ec4c6503
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_36bebea6-bd10-4d4b-b0f0-dbc7ec4c6503","subject":"Error contract","status":"open","region":"eu","participants":["qa-f65b0171f341","qa-2e863709d1c8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.858560648Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-05c3d21a-299c-42c2-8b3f-1a8bb86743e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05c3d21a-299c-42c2-8b3f-1a8bb86743e0
Content-Type: application/json

--- request body ---
{"handle":"qa-4edbc17a8780","password":"****"}

--- response: 200 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-05c3d21a-299c-42c2-8b3f-1a8bb86743e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f2dcc70-ad9b-41a5-9e4b-aa66856350d5"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_36bebea6-bd10-4d4b-b0f0-dbc7ec4c6503/messages
correlation: qa-89cbaa82-ad3b-4541-a810-2838bd7b65cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89cbaa82-ad3b-4541-a810-2838bd7b65cb
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89cbaa82-ad3b-4541-a810-2838bd7b65cb
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_36bebea6-bd10-4d4b-b0f0-dbc7ec4c6503/messages","correlationId":"qa-89cbaa82-ad3b-4541-a810-2838bd7b65cb"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d977db0-2926-44ca-a886-05d2edd49257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d977db0-2926-44ca-a886-05d2edd49257
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d977db0-2926-44ca-a886-05d2edd49257
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-d887241b-3d83-43d3-8db2-dcfb6b5d4de5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d887241b-3d83-43d3-8db2-dcfb6b5d4de5
Content-Type: application/json

--- request body ---
{"handle":"qa-4edbc17a8780","password":"****"}

--- response: 401 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d887241b-3d83-43d3-8db2-dcfb6b5d4de5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d887241b-3d83-43d3-8db2-dcfb6b5d4de5"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-36764ac2-c381-495a-b0d9-96d7197efff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36764ac2-c381-495a-b0d9-96d7197efff9
Content-Type: application/json

--- request body ---
{"handle":"qa-2e863709d1c8","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-36764ac2-c381-495a-b0d9-96d7197efff9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56ed37eb-3df6-49b7-9a55-13fd3ffcfc59"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd8fc9f9-cd94-4b7c-8a3a-3bdc638bf21c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd8fc9f9-cd94-4b7c-8a3a-3bdc638bf21c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd8fc9f9-cd94-4b7c-8a3a-3bdc638bf21c
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a6d42fed-a201-4a32-99bb-4d3b8b5e2abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d42fed-a201-4a32-99bb-4d3b8b5e2abc
Content-Type: application/json

--- request body ---
{"handle":"qa-2e863709d1c8","password":"****"}

--- response: 401 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6d42fed-a201-4a32-99bb-4d3b8b5e2abc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6d42fed-a201-4a32-99bb-4d3b8b5e2abc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1863c0e5-48f1-49c7-8d51-11006f3692a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1863c0e5-48f1-49c7-8d51-11006f3692a2
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1863c0e5-48f1-49c7-8d51-11006f3692a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-a8773ce6-3fd0-44a3-9a7e-a997ecc67ef5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8773ce6-3fd0-44a3-9a7e-a997ecc67ef5
Content-Type: application/json

--- request body ---
{"handle":"qa-f65b0171f341","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8773ce6-3fd0-44a3-9a7e-a997ecc67ef5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8773ce6-3fd0-44a3-9a7e-a997ecc67ef5"}
```
