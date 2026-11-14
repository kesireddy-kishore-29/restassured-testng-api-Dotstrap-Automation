# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-f6c968cf-e52b-485b-b2f7-9ffa428402d9` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-a87b91a8-ae53-4122-932b-8157c1acc42d` |
| 3 | `POST /v1/accounts` | 201 | 30 | `qa-02596870-572f-4f22-9053-305eac625cc6` |
| 4 | `POST /v1/auth/token` | 200 | 38 | `qa-d089873f-d690-4821-ba46-b57750de0ae7` |
| 5 | `POST /v1/conversations` | 201 | 34 | `qa-464e97f9-e004-4bca-ac0f-a39a3b240c9e` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-befebebb-62bb-41e0-b6e8-ee31bff6c37d` |
| 7 | `GET /v1/conversations/{id}` | 403 | 18 | `qa-167ebe9c-d380-4624-84fe-7b414e6c14bb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-61c4f099-9905-4adb-a582-ce41a4617dce` |
| 9 | `POST /v1/auth/token` | 401 | 35 | `qa-0ce0ab11-75cd-4753-85d1-a8be889e9290` |
| 10 | `POST /v1/auth/token` | 200 | 42 | `qa-6d75c964-6daa-4d0f-b337-41f8ec544a6e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 53 | `qa-d0a5500d-5371-47c9-b5d5-5aecd7927958` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-bac522d0-fc22-4e02-9cdc-ba6cb522ebe3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-e85ba0c7-5a6a-403a-a57f-171ef6bd9805` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-fb8157af-67cd-4ca4-9b79-c2094918499b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6c968cf-e52b-485b-b2f7-9ffa428402d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c968cf-e52b-485b-b2f7-9ffa428402d9
Content-Type: application/json

--- request body ---
{"handle":"qa-842483b4a885","displayName":"QA 842483b4a885","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c968cf-e52b-485b-b2f7-9ffa428402d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-842483b4a885
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f2ae6c89-5e06-4f36-8691-c23ba005b66a","handle":"qa-842483b4a885","displayName":"QA 842483b4a885","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.808916332Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a87b91a8-ae53-4122-932b-8157c1acc42d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a87b91a8-ae53-4122-932b-8157c1acc42d
Content-Type: application/json

--- request body ---
{"handle":"qa-ad47c0cfdd9e","displayName":"QA ad47c0cfdd9e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a87b91a8-ae53-4122-932b-8157c1acc42d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-ad47c0cfdd9e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96a30852-dbd6-4909-9e8d-ed932c0d1493","handle":"qa-ad47c0cfdd9e","displayName":"QA ad47c0cfdd9e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.848639837Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-02596870-572f-4f22-9053-305eac625cc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02596870-572f-4f22-9053-305eac625cc6
Content-Type: application/json

--- request body ---
{"handle":"qa-724242331b40","displayName":"QA 724242331b40","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-02596870-572f-4f22-9053-305eac625cc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-724242331b40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f209cb5-676b-464b-883f-430632f464e2","handle":"qa-724242331b40","displayName":"QA 724242331b40","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.895516638Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d089873f-d690-4821-ba46-b57750de0ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d089873f-d690-4821-ba46-b57750de0ae7
Content-Type: application/json

--- request body ---
{"handle":"qa-842483b4a885","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d089873f-d690-4821-ba46-b57750de0ae7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f2ae6c89-5e06-4f36-8691-c23ba005b66a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-464e97f9-e004-4bca-ac0f-a39a3b240c9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-464e97f9-e004-4bca-ac0f-a39a3b240c9e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ad47c0cfdd9e","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-464e97f9-e004-4bca-ac0f-a39a3b240c9e
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
Location: /v1/conversations/cnv_a898353b-bdc5-47e0-970e-c7e7d87458d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a898353b-bdc5-47e0-970e-c7e7d87458d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-842483b4a885","qa-ad47c0cfdd9e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.989827730Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-befebebb-62bb-41e0-b6e8-ee31bff6c37d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-befebebb-62bb-41e0-b6e8-ee31bff6c37d
Content-Type: application/json

--- request body ---
{"handle":"qa-724242331b40","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-befebebb-62bb-41e0-b6e8-ee31bff6c37d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f209cb5-676b-464b-883f-430632f464e2"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a898353b-bdc5-47e0-970e-c7e7d87458d8
correlation: qa-167ebe9c-d380-4624-84fe-7b414e6c14bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167ebe9c-d380-4624-84fe-7b414e6c14bb
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-167ebe9c-d380-4624-84fe-7b414e6c14bb
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a898353b-bdc5-47e0-970e-c7e7d87458d8","correlationId":"qa-167ebe9c-d380-4624-84fe-7b414e6c14bb"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61c4f099-9905-4adb-a582-ce41a4617dce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61c4f099-9905-4adb-a582-ce41a4617dce
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61c4f099-9905-4adb-a582-ce41a4617dce
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
correlation: qa-0ce0ab11-75cd-4753-85d1-a8be889e9290

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ce0ab11-75cd-4753-85d1-a8be889e9290
Content-Type: application/json

--- request body ---
{"handle":"qa-724242331b40","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ce0ab11-75cd-4753-85d1-a8be889e9290
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ce0ab11-75cd-4753-85d1-a8be889e9290"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6d75c964-6daa-4d0f-b337-41f8ec544a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d75c964-6daa-4d0f-b337-41f8ec544a6e
Content-Type: application/json

--- request body ---
{"handle":"qa-ad47c0cfdd9e","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d75c964-6daa-4d0f-b337-41f8ec544a6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96a30852-dbd6-4909-9e8d-ed932c0d1493"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0a5500d-5371-47c9-b5d5-5aecd7927958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a5500d-5371-47c9-b5d5-5aecd7927958
Content-Type: application/json

--- response: 204 in 53 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0a5500d-5371-47c9-b5d5-5aecd7927958
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
correlation: qa-bac522d0-fc22-4e02-9cdc-ba6cb522ebe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac522d0-fc22-4e02-9cdc-ba6cb522ebe3
Content-Type: application/json

--- request body ---
{"handle":"qa-ad47c0cfdd9e","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bac522d0-fc22-4e02-9cdc-ba6cb522ebe3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bac522d0-fc22-4e02-9cdc-ba6cb522ebe3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e85ba0c7-5a6a-403a-a57f-171ef6bd9805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85ba0c7-5a6a-403a-a57f-171ef6bd9805
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e85ba0c7-5a6a-403a-a57f-171ef6bd9805
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
correlation: qa-fb8157af-67cd-4ca4-9b79-c2094918499b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb8157af-67cd-4ca4-9b79-c2094918499b
Content-Type: application/json

--- request body ---
{"handle":"qa-842483b4a885","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb8157af-67cd-4ca4-9b79-c2094918499b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb8157af-67cd-4ca4-9b79-c2094918499b"}
```
