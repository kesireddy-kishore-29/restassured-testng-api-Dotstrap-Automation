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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-d020d869-f38e-40de-a5a9-446be1deaf94` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-a0e24ad1-6674-442b-8a6b-bad9e71a3250` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-ed4d8d01-0d74-4b33-b41b-f70c7a1ceaea` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-278349d2-f67c-4c62-8a97-bb57822ed4dc` |
| 5 | `POST /v1/auth/token` | 200 | 24 | `qa-c82b8c65-071b-4bf8-aaf9-18a8771667a3` |
| 6 | `GET /v1/admin/stats` | 200 | 28 | `qa-3466de7b-5bac-4b26-afa2-9cf667f36f1b` |
| 7 | `POST /v1/auth/token` | 200 | 24 | `qa-e2ef6c76-7dd0-4ff9-9ed4-6bbcb2b3b5f8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-aa48b1b1-d4d5-46aa-affe-6747e6ff1845` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-d553bdb3-363e-46ee-a74a-ef1ea45857ad` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-98c64abc-7a51-4f46-813b-6419d5071840` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-a26dc49d-d157-4c07-9264-65f948dcddea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d020d869-f38e-40de-a5a9-446be1deaf94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d020d869-f38e-40de-a5a9-446be1deaf94
Content-Type: application/json

--- request body ---
{"handle":"qa-8e5af8aba30e","displayName":"QA 8e5af8aba30e","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-d020d869-f38e-40de-a5a9-446be1deaf94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Location: /v1/accounts/qa-8e5af8aba30e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c00b95a6-5ff8-40a3-afb6-1b08212c78e2","handle":"qa-8e5af8aba30e","displayName":"QA 8e5af8aba30e","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.212785278Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a0e24ad1-6674-442b-8a6b-bad9e71a3250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e24ad1-6674-442b-8a6b-bad9e71a3250
Content-Type: application/json

--- request body ---
{"handle":"qa-d80fd6e085d7","displayName":"QA d80fd6e085d7","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0e24ad1-6674-442b-8a6b-bad9e71a3250
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Location: /v1/accounts/qa-d80fd6e085d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2732217-5efb-49f8-a934-fc0504964114","handle":"qa-d80fd6e085d7","displayName":"QA d80fd6e085d7","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.236887031Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed4d8d01-0d74-4b33-b41b-f70c7a1ceaea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed4d8d01-0d74-4b33-b41b-f70c7a1ceaea
Content-Type: application/json

--- request body ---
{"handle":"qa-8e5af8aba30e","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed4d8d01-0d74-4b33-b41b-f70c7a1ceaea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c00b95a6-5ff8-40a3-afb6-1b08212c78e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-278349d2-f67c-4c62-8a97-bb57822ed4dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-278349d2-f67c-4c62-8a97-bb57822ed4dc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d80fd6e085d7","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-278349d2-f67c-4c62-8a97-bb57822ed4dc
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
Location: /v1/conversations/cnv_6df10c7b-086a-4568-8907-21afc558b281
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6df10c7b-086a-4568-8907-21afc558b281","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e5af8aba30e","qa-d80fd6e085d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:47.280502693Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c82b8c65-071b-4bf8-aaf9-18a8771667a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c82b8c65-071b-4bf8-aaf9-18a8771667a3
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-c82b8c65-071b-4bf8-aaf9-18a8771667a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aeebfb11-8c47-424c-9334-e21bf967f70e"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-3466de7b-5bac-4b26-afa2-9cf667f36f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3466de7b-5bac-4b26-afa2-9cf667f36f1b
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3466de7b-5bac-4b26-afa2-9cf667f36f1b
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
correlation: qa-e2ef6c76-7dd0-4ff9-9ed4-6bbcb2b3b5f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ef6c76-7dd0-4ff9-9ed4-6bbcb2b3b5f8
Content-Type: application/json

--- request body ---
{"handle":"qa-d80fd6e085d7","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2ef6c76-7dd0-4ff9-9ed4-6bbcb2b3b5f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2732217-5efb-49f8-a934-fc0504964114"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa48b1b1-d4d5-46aa-affe-6747e6ff1845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa48b1b1-d4d5-46aa-affe-6747e6ff1845
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa48b1b1-d4d5-46aa-affe-6747e6ff1845
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
correlation: qa-d553bdb3-363e-46ee-a74a-ef1ea45857ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d553bdb3-363e-46ee-a74a-ef1ea45857ad
Content-Type: application/json

--- request body ---
{"handle":"qa-d80fd6e085d7","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d553bdb3-363e-46ee-a74a-ef1ea45857ad
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d553bdb3-363e-46ee-a74a-ef1ea45857ad"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98c64abc-7a51-4f46-813b-6419d5071840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98c64abc-7a51-4f46-813b-6419d5071840
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98c64abc-7a51-4f46-813b-6419d5071840
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
correlation: qa-a26dc49d-d157-4c07-9264-65f948dcddea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a26dc49d-d157-4c07-9264-65f948dcddea
Content-Type: application/json

--- request body ---
{"handle":"qa-8e5af8aba30e","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a26dc49d-d157-4c07-9264-65f948dcddea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a26dc49d-d157-4c07-9264-65f948dcddea"}
```
