# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-53ea0e3c-2b4b-4442-928b-909364db8fb6` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-f79e192a-3c72-4085-a63a-3682b9de4e86` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-c3f23fd0-957e-4cc5-8263-0faa1901e991` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-b5f1eeb3-2da0-420e-a0e5-98fffb56f0c7` |
| 5 | `POST /v1/auth/token` | 200 | 21 | `qa-0b0cba0a-9518-4cd4-83e3-67d706d81adc` |
| 6 | `GET /v1/admin/stats` | 200 | 22 | `qa-809ccb3e-ccad-4be1-bff5-60f1cc0baa8d` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-4ecaaa4c-d92f-4a4c-9668-b6b20a5f0e68` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d97d6674-652b-4439-9f57-2efba148414e` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-2616adc7-12ef-497d-a4b2-c0e49c0d84f4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-31747de8-60d2-4ab1-a1d9-aa2c76af8899` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-db6bcea6-345c-4124-9f09-91dc5741e9d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53ea0e3c-2b4b-4442-928b-909364db8fb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53ea0e3c-2b4b-4442-928b-909364db8fb6
Content-Type: application/json

--- request body ---
{"handle":"qa-6e9ab87e2522","displayName":"QA 6e9ab87e2522","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-53ea0e3c-2b4b-4442-928b-909364db8fb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 5
Location: /v1/accounts/qa-6e9ab87e2522
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29b4250f-f507-4531-9f74-09519b8c7258","handle":"qa-6e9ab87e2522","displayName":"QA 6e9ab87e2522","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.829243568Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f79e192a-3c72-4085-a63a-3682b9de4e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f79e192a-3c72-4085-a63a-3682b9de4e86
Content-Type: application/json

--- request body ---
{"handle":"qa-46121bcc1505","displayName":"QA 46121bcc1505","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f79e192a-3c72-4085-a63a-3682b9de4e86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 5
Location: /v1/accounts/qa-46121bcc1505
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f03c1058-b046-43cc-a921-ff78dea7c881","handle":"qa-46121bcc1505","displayName":"QA 46121bcc1505","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.880259548Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c3f23fd0-957e-4cc5-8263-0faa1901e991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f23fd0-957e-4cc5-8263-0faa1901e991
Content-Type: application/json

--- request body ---
{"handle":"qa-6e9ab87e2522","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3f23fd0-957e-4cc5-8263-0faa1901e991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29b4250f-f507-4531-9f74-09519b8c7258"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b5f1eeb3-2da0-420e-a0e5-98fffb56f0c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5f1eeb3-2da0-420e-a0e5-98fffb56f0c7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-46121bcc1505","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5f1eeb3-2da0-420e-a0e5-98fffb56f0c7
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
Location: /v1/conversations/cnv_d64faa95-f2c5-4b1c-9400-093bc55c3522
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d64faa95-f2c5-4b1c-9400-093bc55c3522","subject":"Error contract","status":"open","region":"eu","participants":["qa-6e9ab87e2522","qa-46121bcc1505"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.936092246Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0b0cba0a-9518-4cd4-83e3-67d706d81adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b0cba0a-9518-4cd4-83e3-67d706d81adc
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b0cba0a-9518-4cd4-83e3-67d706d81adc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ce427ff-f121-45a1-bc42-96d3752d20cd"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-809ccb3e-ccad-4be1-bff5-60f1cc0baa8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-809ccb3e-ccad-4be1-bff5-60f1cc0baa8d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-809ccb3e-ccad-4be1-bff5-60f1cc0baa8d
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
Content-Length: 46

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4ecaaa4c-d92f-4a4c-9668-b6b20a5f0e68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ecaaa4c-d92f-4a4c-9668-b6b20a5f0e68
Content-Type: application/json

--- request body ---
{"handle":"qa-46121bcc1505","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ecaaa4c-d92f-4a4c-9668-b6b20a5f0e68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03c1058-b046-43cc-a921-ff78dea7c881"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d97d6674-652b-4439-9f57-2efba148414e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d97d6674-652b-4439-9f57-2efba148414e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d97d6674-652b-4439-9f57-2efba148414e
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-2616adc7-12ef-497d-a4b2-c0e49c0d84f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2616adc7-12ef-497d-a4b2-c0e49c0d84f4
Content-Type: application/json

--- request body ---
{"handle":"qa-46121bcc1505","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2616adc7-12ef-497d-a4b2-c0e49c0d84f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2616adc7-12ef-497d-a4b2-c0e49c0d84f4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31747de8-60d2-4ab1-a1d9-aa2c76af8899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31747de8-60d2-4ab1-a1d9-aa2c76af8899
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31747de8-60d2-4ab1-a1d9-aa2c76af8899
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-db6bcea6-345c-4124-9f09-91dc5741e9d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db6bcea6-345c-4124-9f09-91dc5741e9d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6e9ab87e2522","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db6bcea6-345c-4124-9f09-91dc5741e9d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db6bcea6-345c-4124-9f09-91dc5741e9d8"}
```
