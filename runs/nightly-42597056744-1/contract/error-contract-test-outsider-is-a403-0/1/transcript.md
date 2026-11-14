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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-325dd46d-801a-474d-a5b1-15c6dfd4177b` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-69463f48-a4b7-4344-8fa4-f5bad8c0f90f` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-fd41fd90-ae58-40f9-8ca5-2c9dee8fc9b8` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-10f060d9-9239-4702-ab8e-93c3ac008442` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-52fe54e9-5db8-42af-8486-0d54ccd9abe5` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-c45c8ebf-e301-4a1d-bb24-0ca11e5b9abc` |
| 7 | `GET /v1/conversations/{id}` | 403 | 12 | `qa-99a8a4bc-49be-402a-ba43-5652ff685e49` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-0f37e954-931d-4350-8e3f-c873742584f0` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-6371352f-836a-4665-b9bc-a56a6a2b9c5c` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-99f52084-15bd-46e8-9215-6ccdd715df1e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-c91b63c5-0549-4166-a7d3-8c234d5624e6` |
| 12 | `POST /v1/auth/token` | 401 | 15 | `qa-10d6bb5e-6c3e-4394-b2af-9a3646431d91` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0396a33e-e3ef-41df-bf89-c38efd501441` |
| 14 | `POST /v1/auth/token` | 401 | 34 | `qa-707130f2-9850-494a-a3d5-bf14f350feeb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-325dd46d-801a-474d-a5b1-15c6dfd4177b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325dd46d-801a-474d-a5b1-15c6dfd4177b
Content-Type: application/json

--- request body ---
{"handle":"qa-fa68b7c9d63b","displayName":"QA fa68b7c9d63b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-325dd46d-801a-474d-a5b1-15c6dfd4177b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Location: /v1/accounts/qa-fa68b7c9d63b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3d411d26-b39e-4ec1-bf05-6a081501800c","handle":"qa-fa68b7c9d63b","displayName":"QA fa68b7c9d63b","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.956208639Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-69463f48-a4b7-4344-8fa4-f5bad8c0f90f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69463f48-a4b7-4344-8fa4-f5bad8c0f90f
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc1312b50d2","displayName":"QA ffc1312b50d2","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-69463f48-a4b7-4344-8fa4-f5bad8c0f90f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-ffc1312b50d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c231ab9-7a73-4469-9210-7a022bad7dc6","handle":"qa-ffc1312b50d2","displayName":"QA ffc1312b50d2","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.004892233Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-fd41fd90-ae58-40f9-8ca5-2c9dee8fc9b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd41fd90-ae58-40f9-8ca5-2c9dee8fc9b8
Content-Type: application/json

--- request body ---
{"handle":"qa-502a11fdb602","displayName":"QA 502a11fdb602","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd41fd90-ae58-40f9-8ca5-2c9dee8fc9b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 10
Location: /v1/accounts/qa-502a11fdb602
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ffdf2d9-00ae-483a-99a7-975172ef487c","handle":"qa-502a11fdb602","displayName":"QA 502a11fdb602","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.039918068Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-10f060d9-9239-4702-ab8e-93c3ac008442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10f060d9-9239-4702-ab8e-93c3ac008442
Content-Type: application/json

--- request body ---
{"handle":"qa-fa68b7c9d63b","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-10f060d9-9239-4702-ab8e-93c3ac008442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d411d26-b39e-4ec1-bf05-6a081501800c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-52fe54e9-5db8-42af-8486-0d54ccd9abe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52fe54e9-5db8-42af-8486-0d54ccd9abe5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ffc1312b50d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-52fe54e9-5db8-42af-8486-0d54ccd9abe5
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
Location: /v1/conversations/cnv_04f1cbc8-a531-4701-8905-6da4e2868bcc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_04f1cbc8-a531-4701-8905-6da4e2868bcc","subject":"Error contract","status":"open","region":"eu","participants":["qa-fa68b7c9d63b","qa-ffc1312b50d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.074981582Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c45c8ebf-e301-4a1d-bb24-0ca11e5b9abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45c8ebf-e301-4a1d-bb24-0ca11e5b9abc
Content-Type: application/json

--- request body ---
{"handle":"qa-502a11fdb602","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c45c8ebf-e301-4a1d-bb24-0ca11e5b9abc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ffdf2d9-00ae-483a-99a7-975172ef487c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_04f1cbc8-a531-4701-8905-6da4e2868bcc
correlation: qa-99a8a4bc-49be-402a-ba43-5652ff685e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99a8a4bc-49be-402a-ba43-5652ff685e49
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99a8a4bc-49be-402a-ba43-5652ff685e49
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_04f1cbc8-a531-4701-8905-6da4e2868bcc","correlationId":"qa-99a8a4bc-49be-402a-ba43-5652ff685e49"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f37e954-931d-4350-8e3f-c873742584f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f37e954-931d-4350-8e3f-c873742584f0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f37e954-931d-4350-8e3f-c873742584f0
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
correlation: qa-6371352f-836a-4665-b9bc-a56a6a2b9c5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6371352f-836a-4665-b9bc-a56a6a2b9c5c
Content-Type: application/json

--- request body ---
{"handle":"qa-502a11fdb602","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6371352f-836a-4665-b9bc-a56a6a2b9c5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6371352f-836a-4665-b9bc-a56a6a2b9c5c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-99f52084-15bd-46e8-9215-6ccdd715df1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99f52084-15bd-46e8-9215-6ccdd715df1e
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc1312b50d2","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-99f52084-15bd-46e8-9215-6ccdd715df1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c231ab9-7a73-4469-9210-7a022bad7dc6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c91b63c5-0549-4166-a7d3-8c234d5624e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c91b63c5-0549-4166-a7d3-8c234d5624e6
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c91b63c5-0549-4166-a7d3-8c234d5624e6
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
correlation: qa-10d6bb5e-6c3e-4394-b2af-9a3646431d91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d6bb5e-6c3e-4394-b2af-9a3646431d91
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc1312b50d2","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10d6bb5e-6c3e-4394-b2af-9a3646431d91
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10d6bb5e-6c3e-4394-b2af-9a3646431d91"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0396a33e-e3ef-41df-bf89-c38efd501441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0396a33e-e3ef-41df-bf89-c38efd501441
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0396a33e-e3ef-41df-bf89-c38efd501441
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-707130f2-9850-494a-a3d5-bf14f350feeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-707130f2-9850-494a-a3d5-bf14f350feeb
Content-Type: application/json

--- request body ---
{"handle":"qa-fa68b7c9d63b","password":"****"}

--- response: 401 in 34 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-707130f2-9850-494a-a3d5-bf14f350feeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-707130f2-9850-494a-a3d5-bf14f350feeb"}
```
