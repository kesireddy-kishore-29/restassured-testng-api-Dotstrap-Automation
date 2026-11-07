# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-807311d0-ca6a-454c-a730-6a03910efa99` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-5366a9a2-151b-4b75-a0f7-156771d3db98` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-2528ff82-d324-4d42-9fd6-39d7b8680518` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-9c1d9fbc-ad62-42cd-86a1-741d0168a052` |
| 5 | `POST /v1/accounts` | 422 | 18 | `qa-e4ebda4a-58b9-4c26-ae8c-9080c1fc3516` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-62a6aa6d-6491-4d6c-8f50-6679bed33e5f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-224e6929-a815-4b96-85a7-1e7045e0f2e1` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-0f0d631f-64af-4830-83bb-75a922559dc3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-71862521-ed8b-407d-a171-2530d46f1d56` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-795409ac-01fb-4474-9ec1-e123915a18d3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-807311d0-ca6a-454c-a730-6a03910efa99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-807311d0-ca6a-454c-a730-6a03910efa99
Content-Type: application/json

--- request body ---
{"handle":"qa-b41e0a358126","displayName":"QA b41e0a358126","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-807311d0-ca6a-454c-a730-6a03910efa99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Location: /v1/accounts/qa-b41e0a358126
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76d78e77-75ce-4fe6-826c-20fada3b248e","handle":"qa-b41e0a358126","displayName":"QA b41e0a358126","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.343391390Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5366a9a2-151b-4b75-a0f7-156771d3db98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5366a9a2-151b-4b75-a0f7-156771d3db98
Content-Type: application/json

--- request body ---
{"handle":"qa-15bc53a36670","displayName":"QA 15bc53a36670","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5366a9a2-151b-4b75-a0f7-156771d3db98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Location: /v1/accounts/qa-15bc53a36670
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0ea1cd71-7403-4c2a-ad2d-e2060e2ddc64","handle":"qa-15bc53a36670","displayName":"QA 15bc53a36670","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.379732688Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2528ff82-d324-4d42-9fd6-39d7b8680518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2528ff82-d324-4d42-9fd6-39d7b8680518
Content-Type: application/json

--- request body ---
{"handle":"qa-b41e0a358126","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2528ff82-d324-4d42-9fd6-39d7b8680518
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76d78e77-75ce-4fe6-826c-20fada3b248e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9c1d9fbc-ad62-42cd-86a1-741d0168a052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1d9fbc-ad62-42cd-86a1-741d0168a052
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15bc53a36670","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c1d9fbc-ad62-42cd-86a1-741d0168a052
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
Location: /v1/conversations/cnv_2aca8039-e296-45bc-85bb-cad962064bb4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2aca8039-e296-45bc-85bb-cad962064bb4","subject":"Error contract","status":"open","region":"eu","participants":["qa-b41e0a358126","qa-15bc53a36670"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.457078377Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e4ebda4a-58b9-4c26-ae8c-9080c1fc3516

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ebda4a-58b9-4c26-ae8c-9080c1fc3516
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4ebda4a-58b9-4c26-ae8c-9080c1fc3516
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-e4ebda4a-58b9-4c26-ae8c-9080c1fc3516","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-62a6aa6d-6491-4d6c-8f50-6679bed33e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a6aa6d-6491-4d6c-8f50-6679bed33e5f
Content-Type: application/json

--- request body ---
{"handle":"qa-15bc53a36670","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-62a6aa6d-6491-4d6c-8f50-6679bed33e5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0ea1cd71-7403-4c2a-ad2d-e2060e2ddc64"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-224e6929-a815-4b96-85a7-1e7045e0f2e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224e6929-a815-4b96-85a7-1e7045e0f2e1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-224e6929-a815-4b96-85a7-1e7045e0f2e1
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
correlation: qa-0f0d631f-64af-4830-83bb-75a922559dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0d631f-64af-4830-83bb-75a922559dc3
Content-Type: application/json

--- request body ---
{"handle":"qa-15bc53a36670","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f0d631f-64af-4830-83bb-75a922559dc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f0d631f-64af-4830-83bb-75a922559dc3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71862521-ed8b-407d-a171-2530d46f1d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71862521-ed8b-407d-a171-2530d46f1d56
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71862521-ed8b-407d-a171-2530d46f1d56
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
correlation: qa-795409ac-01fb-4474-9ec1-e123915a18d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795409ac-01fb-4474-9ec1-e123915a18d3
Content-Type: application/json

--- request body ---
{"handle":"qa-b41e0a358126","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-795409ac-01fb-4474-9ec1-e123915a18d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-795409ac-01fb-4474-9ec1-e123915a18d3"}
```
