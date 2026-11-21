# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 393 | `qa-f7bfcaaf-f119-4489-8539-149ab4b1a540` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-159aad6e-f949-4e0c-809f-458ea7573ffe` |
| 3 | `GET /health` | 200 | 41 | `qa-3b4ad3a2-111e-43ba-8c48-d69d620a4686` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-fd815406-f444-4274-acfc-18e1c2b35b99` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-33a7a834-2b44-4d77-9394-3cfce0c90565` |
| 6 | `PATCH /v1/accounts/me` | 200 | 25 | `qa-b6875809-9149-4808-b834-a349838d04e2` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 17 | `qa-9b36050e-3824-4dcc-9a85-4b03f9f62e79` |
| 8 | `POST /v1/conversations` | 201 | 13 | `qa-bfa258e0-9f9f-444f-a438-2888693dc781` |
| 9 | `GET /v1/conversations` | 200 | 15 | `qa-ba746127-4dcb-4a98-b844-a72c9426b9f1` |
| 10 | `POST /v1/auth/token` | 200 | 18 | `qa-c4847e44-38f7-49c4-8467-544ae28bf62d` |
| 11 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-860fc56b-10fd-40bf-95b0-c88352f19bdc` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-d120c073-2dfa-4ccb-92e8-1095d41fee6c` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-0ef8d8ad-ee91-42c7-9407-b3fbb8b4c567` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-84c2e163-9f14-48b9-b27d-14604bfef4e4` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 20 | `qa-0144ccd9-e4e9-4547-a593-9d8b3e9404d7` |
| 16 | `GET /v1/credits/balance` | 200 | 21 | `qa-98c17529-29f9-4565-9db5-f961e1ad5281` |
| 17 | `GET /v1/credits/ledger` | 200 | 13 | `qa-baa7640f-7ea3-4112-94d9-6401071989a5` |
| 18 | `POST /v1/credits/purchases` | 201 | 20 | `qa-ec098504-047e-4822-8c1c-516c8fbd3bd6` |
| 19 | `GET /v1/admin/stats` | 403 | 24 | `qa-54c067e1-efd5-487e-9470-e2585d0db0e0` |
| 20 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5132bfc4-41bd-4067-8934-3162a8021345` |
| 21 | `POST /v1/auth/token` | 401 | 17 | `qa-ab31b25e-dfa4-4612-8dbb-c64f2513fdeb` |
| 22 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d24d6963-e7da-4a12-803e-7bcc10fb2274` |
| 23 | `POST /v1/auth/token` | 401 | 18 | `qa-043bbf43-3491-4fc2-b165-82a8f1b29950` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f7bfcaaf-f119-4489-8539-149ab4b1a540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7bfcaaf-f119-4489-8539-149ab4b1a540
Content-Type: application/json

--- request body ---
{"handle":"qa-59e8ac9bf371","displayName":"QA 59e8ac9bf371","password":"****","region":"eu"}

--- response: 201 in 393 ms ---
Date: Fri, 13 Nov 2026 09:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7bfcaaf-f119-4489-8539-149ab4b1a540
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-59e8ac9bf371
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4768553d-77c4-4a7b-8aab-7f2dda8f38a8","handle":"qa-59e8ac9bf371","displayName":"QA 59e8ac9bf371","region":"eu","role":"user","createdAt":"2026-11-13T09:42:04.693283640Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-159aad6e-f949-4e0c-809f-458ea7573ffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-159aad6e-f949-4e0c-809f-458ea7573ffe
Content-Type: application/json

--- request body ---
{"handle":"qa-eecef1add54b","displayName":"QA eecef1add54b","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-159aad6e-f949-4e0c-809f-458ea7573ffe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-eecef1add54b
X-Served-Region: us
Content-Length: 181

{"id":"acc_90f1e547-4352-4c08-b408-1880b4014b65","handle":"qa-eecef1add54b","displayName":"QA eecef1add54b","region":"us","role":"user","createdAt":"2026-11-13T09:42:05.036158250Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-3b4ad3a2-111e-43ba-8c48-d69d620a4686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b4ad3a2-111e-43ba-8c48-d69d620a4686
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b4ad3a2-111e-43ba-8c48-d69d620a4686
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-fd815406-f444-4274-acfc-18e1c2b35b99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd815406-f444-4274-acfc-18e1c2b35b99
Content-Type: application/json

--- request body ---
{"handle":"qa-59e8ac9bf371","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd815406-f444-4274-acfc-18e1c2b35b99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4768553d-77c4-4a7b-8aab-7f2dda8f38a8"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-33a7a834-2b44-4d77-9394-3cfce0c90565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a7a834-2b44-4d77-9394-3cfce0c90565
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a7a834-2b44-4d77-9394-3cfce0c90565
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
Content-Length: 181

{"id":"acc_4768553d-77c4-4a7b-8aab-7f2dda8f38a8","handle":"qa-59e8ac9bf371","displayName":"QA 59e8ac9bf371","region":"eu","role":"user","createdAt":"2026-11-13T09:42:04.693283640Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b6875809-9149-4808-b834-a349838d04e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6875809-9149-4808-b834-a349838d04e2
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6875809-9149-4808-b834-a349838d04e2
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
Content-Length: 178

{"id":"acc_4768553d-77c4-4a7b-8aab-7f2dda8f38a8","handle":"qa-59e8ac9bf371","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-13T09:42:04.693283640Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-eecef1add54b
correlation: qa-9b36050e-3824-4dcc-9a85-4b03f9f62e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b36050e-3824-4dcc-9a85-4b03f9f62e79
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b36050e-3824-4dcc-9a85-4b03f9f62e79
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
Content-Length: 74

{"handle":"qa-eecef1add54b","displayName":"QA eecef1add54b","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-bfa258e0-9f9f-444f-a438-2888693dc781

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa258e0-9f9f-444f-a438-2888693dc781
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eecef1add54b","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa258e0-9f9f-444f-a438-2888693dc781
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
X-Served-Region: eu
Location: /v1/conversations/cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f
X-Data-Region: us
Content-Length: 238

{"id":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-59e8ac9bf371","qa-eecef1add54b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.270246971Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-ba746127-4dcb-4a98-b844-a72c9426b9f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba746127-4dcb-4a98-b844-a72c9426b9f1
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba746127-4dcb-4a98-b844-a72c9426b9f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-59e8ac9bf371","qa-eecef1add54b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.270246971Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c4847e44-38f7-49c4-8467-544ae28bf62d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4847e44-38f7-49c4-8467-544ae28bf62d
Content-Type: application/json

--- request body ---
{"handle":"qa-eecef1add54b","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4847e44-38f7-49c4-8467-544ae28bf62d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90f1e547-4352-4c08-b408-1880b4014b65"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f
correlation: qa-860fc56b-10fd-40bf-95b0-c88352f19bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-860fc56b-10fd-40bf-95b0-c88352f19bdc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-860fc56b-10fd-40bf-95b0-c88352f19bdc
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-59e8ac9bf371","qa-eecef1add54b"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-13T09:42:05.270246971Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f/messages
correlation: qa-d120c073-2dfa-4ccb-92e8-1095d41fee6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d120c073-2dfa-4ccb-92e8-1095d41fee6c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d120c073-2dfa-4ccb-92e8-1095d41fee6c
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
Content-Length: 215

{"items":[{"id":"msg_e431acc0-8d35-416e-81b1-341c5e8c8754","conversationId":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","sender":"qa-59e8ac9bf371","body":"Hi","createdAt":"2026-11-13T09:42:05.270272820Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f/messages
correlation: qa-0ef8d8ad-ee91-42c7-9407-b3fbb8b4c567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ef8d8ad-ee91-42c7-9407-b3fbb8b4c567
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ef8d8ad-ee91-42c7-9407-b3fbb8b4c567
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_2bf9a9cb-03c0-4969-9764-196ab1363dac","conversationId":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","sender":"qa-eecef1add54b","body":"Reply","createdAt":"2026-11-13T09:42:05.397380632Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f/read
correlation: qa-84c2e163-9f14-48b9-b27d-14604bfef4e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c2e163-9f14-48b9-b27d-14604bfef4e4
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-84c2e163-9f14-48b9-b27d-14604bfef4e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f/close
correlation: qa-0144ccd9-e4e9-4547-a593-9d8b3e9404d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0144ccd9-e4e9-4547-a593-9d8b3e9404d7
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0144ccd9-e4e9-4547-a593-9d8b3e9404d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-59e8ac9bf371","qa-eecef1add54b"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.270246971Z","closedAt":"2026-11-13T09:42:05.460940496Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-98c17529-29f9-4565-9db5-f961e1ad5281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98c17529-29f9-4565-9db5-f961e1ad5281
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-98c17529-29f9-4565-9db5-f961e1ad5281
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_4768553d-77c4-4a7b-8aab-7f2dda8f38a8"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-baa7640f-7ea3-4112-94d9-6401071989a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa7640f-7ea3-4112-94d9-6401071989a5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa7640f-7ea3-4112-94d9-6401071989a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_6999aaae-3a2d-4846-849b-6fc3b66ea5e9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:04.693290600Z"},{"id":"led_edcd9555-de29-4a90-84ec-d854f1ffd6f6","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_76ec1fbf-9c51-4585-823f-a0bd606eb82f","createdAt":"2026-11-13T09:42:05.270214732Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ec098504-047e-4822-8c1c-516c8fbd3bd6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57c14f5fc24a49fa95b72b38bd5b3215
X-Correlation-Id: qa-ec098504-047e-4822-8c1c-516c8fbd3bd6
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec098504-047e-4822-8c1c-516c8fbd3bd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_ddff739b-da38-47c5-ad3d-705ec6752bee
Content-Length: 144

{"id":"pur_ddff739b-da38-47c5-ad3d-705ec6752bee","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-13T09:42:05.548836614Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-54c067e1-efd5-487e-9470-e2585d0db0e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c067e1-efd5-487e-9470-e2585d0db0e0
Content-Type: application/json

--- response: 403 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54c067e1-efd5-487e-9470-e2585d0db0e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-54c067e1-efd5-487e-9470-e2585d0db0e0"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5132bfc4-41bd-4067-8934-3162a8021345

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5132bfc4-41bd-4067-8934-3162a8021345
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5132bfc4-41bd-4067-8934-3162a8021345
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-ab31b25e-dfa4-4612-8dbb-c64f2513fdeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab31b25e-dfa4-4612-8dbb-c64f2513fdeb
Content-Type: application/json

--- request body ---
{"handle":"qa-eecef1add54b","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab31b25e-dfa4-4612-8dbb-c64f2513fdeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab31b25e-dfa4-4612-8dbb-c64f2513fdeb"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d24d6963-e7da-4a12-803e-7bcc10fb2274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d24d6963-e7da-4a12-803e-7bcc10fb2274
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d24d6963-e7da-4a12-803e-7bcc10fb2274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-043bbf43-3491-4fc2-b165-82a8f1b29950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-043bbf43-3491-4fc2-b165-82a8f1b29950
Content-Type: application/json

--- request body ---
{"handle":"qa-59e8ac9bf371","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-043bbf43-3491-4fc2-b165-82a8f1b29950
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-043bbf43-3491-4fc2-b165-82a8f1b29950"}
```
