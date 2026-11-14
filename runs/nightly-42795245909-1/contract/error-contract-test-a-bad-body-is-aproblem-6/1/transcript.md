# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-06660519-13fa-4eea-92c5-c356dd9f42de` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-e961fd16-91c9-4461-be50-95d3fa1907de` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-42df5879-a3bf-4168-8590-271f5a429bf5` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-3863f69d-71f7-47a8-b089-6f6aba60d554` |
| 5 | `PATCH /v1/accounts/me` | 400 | 10 | `qa-91160e70-0952-4142-ab3d-bbdfaf6f5452` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-78430eab-b0be-4687-bb8b-767357800abc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-a0a7c93d-f4e5-4b01-9aa2-3e004650ca01` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-8ec099c8-a042-47db-8a09-6875c255f7b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-98871f3a-4b69-4cd4-8378-f9bf54440935` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-a3a8fd0a-8730-4cfc-8532-5df4ac00f1b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-06660519-13fa-4eea-92c5-c356dd9f42de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06660519-13fa-4eea-92c5-c356dd9f42de
Content-Type: application/json

--- request body ---
{"handle":"qa-86dbaa0f10f2","displayName":"QA 86dbaa0f10f2","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-06660519-13fa-4eea-92c5-c356dd9f42de
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
Location: /v1/accounts/qa-86dbaa0f10f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b2b5353-9a29-4b34-a124-1fd0b2aad32d","handle":"qa-86dbaa0f10f2","displayName":"QA 86dbaa0f10f2","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.383401386Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e961fd16-91c9-4461-be50-95d3fa1907de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e961fd16-91c9-4461-be50-95d3fa1907de
Content-Type: application/json

--- request body ---
{"handle":"qa-71946e2a4ab9","displayName":"QA 71946e2a4ab9","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e961fd16-91c9-4461-be50-95d3fa1907de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-71946e2a4ab9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4eb261b7-f1b7-48ec-9598-6745bded65fa","handle":"qa-71946e2a4ab9","displayName":"QA 71946e2a4ab9","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.452758619Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-42df5879-a3bf-4168-8590-271f5a429bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42df5879-a3bf-4168-8590-271f5a429bf5
Content-Type: application/json

--- request body ---
{"handle":"qa-86dbaa0f10f2","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-42df5879-a3bf-4168-8590-271f5a429bf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b2b5353-9a29-4b34-a124-1fd0b2aad32d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3863f69d-71f7-47a8-b089-6f6aba60d554

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3863f69d-71f7-47a8-b089-6f6aba60d554
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-71946e2a4ab9","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3863f69d-71f7-47a8-b089-6f6aba60d554
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
Location: /v1/conversations/cnv_9b4ba31d-8980-474e-8c7a-3c9f3fd27edd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9b4ba31d-8980-474e-8c7a-3c9f3fd27edd","subject":"Error contract","status":"open","region":"eu","participants":["qa-86dbaa0f10f2","qa-71946e2a4ab9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.502697933Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-91160e70-0952-4142-ab3d-bbdfaf6f5452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91160e70-0952-4142-ab3d-bbdfaf6f5452
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91160e70-0952-4142-ab3d-bbdfaf6f5452
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-91160e70-0952-4142-ab3d-bbdfaf6f5452"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-78430eab-b0be-4687-bb8b-767357800abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78430eab-b0be-4687-bb8b-767357800abc
Content-Type: application/json

--- request body ---
{"handle":"qa-71946e2a4ab9","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-78430eab-b0be-4687-bb8b-767357800abc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4eb261b7-f1b7-48ec-9598-6745bded65fa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0a7c93d-f4e5-4b01-9aa2-3e004650ca01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0a7c93d-f4e5-4b01-9aa2-3e004650ca01
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0a7c93d-f4e5-4b01-9aa2-3e004650ca01
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
correlation: qa-8ec099c8-a042-47db-8a09-6875c255f7b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec099c8-a042-47db-8a09-6875c255f7b5
Content-Type: application/json

--- request body ---
{"handle":"qa-71946e2a4ab9","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ec099c8-a042-47db-8a09-6875c255f7b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ec099c8-a042-47db-8a09-6875c255f7b5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98871f3a-4b69-4cd4-8378-f9bf54440935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98871f3a-4b69-4cd4-8378-f9bf54440935
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98871f3a-4b69-4cd4-8378-f9bf54440935
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
correlation: qa-a3a8fd0a-8730-4cfc-8532-5df4ac00f1b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3a8fd0a-8730-4cfc-8532-5df4ac00f1b9
Content-Type: application/json

--- request body ---
{"handle":"qa-86dbaa0f10f2","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3a8fd0a-8730-4cfc-8532-5df4ac00f1b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3a8fd0a-8730-4cfc-8532-5df4ac00f1b9"}
```
