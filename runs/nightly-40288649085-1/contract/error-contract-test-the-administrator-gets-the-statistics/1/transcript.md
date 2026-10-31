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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-0ae855f2-97a6-48c3-a480-22556c60ccfd` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-a5285d8b-a279-475b-a6b9-48b8c6bcc7b3` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-1a19fb94-7390-415b-ad6d-107932983547` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-09f88e43-304c-4f46-a179-6964ecf673ec` |
| 5 | `POST /v1/auth/token` | 200 | 8 | `qa-19d4b4ed-822b-4a03-9c58-a2ff4f7dd654` |
| 6 | `GET /v1/admin/stats` | 200 | 14 | `qa-2c1a675e-83e5-4459-9543-42fe58fa5214` |
| 7 | `POST /v1/auth/token` | 200 | 18 | `qa-62354253-577e-4875-814a-d991e375e5f8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-52172b1c-6810-4ce2-b257-c3f997907660` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-f0bf2ce1-152e-4f99-9315-0ee9c230aca4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-16dd5385-c5e8-4046-bf93-0947cfa38f5e` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-61aa43e7-3658-4d9f-8750-053d88b6bab1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ae855f2-97a6-48c3-a480-22556c60ccfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ae855f2-97a6-48c3-a480-22556c60ccfd
Content-Type: application/json

--- request body ---
{"handle":"qa-e3333838910e","displayName":"QA e3333838910e","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ae855f2-97a6-48c3-a480-22556c60ccfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Location: /v1/accounts/qa-e3333838910e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cc9ac44-4c7c-4157-a8a3-cece8082fc2e","handle":"qa-e3333838910e","displayName":"QA e3333838910e","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.916359962Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a5285d8b-a279-475b-a6b9-48b8c6bcc7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5285d8b-a279-475b-a6b9-48b8c6bcc7b3
Content-Type: application/json

--- request body ---
{"handle":"qa-4702b68efb92","displayName":"QA 4702b68efb92","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5285d8b-a279-475b-a6b9-48b8c6bcc7b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Location: /v1/accounts/qa-4702b68efb92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fab07f0a-6da8-46cf-8b4f-eed58437dc3e","handle":"qa-4702b68efb92","displayName":"QA 4702b68efb92","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.939816790Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1a19fb94-7390-415b-ad6d-107932983547

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a19fb94-7390-415b-ad6d-107932983547
Content-Type: application/json

--- request body ---
{"handle":"qa-e3333838910e","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a19fb94-7390-415b-ad6d-107932983547
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cc9ac44-4c7c-4157-a8a3-cece8082fc2e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-09f88e43-304c-4f46-a179-6964ecf673ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f88e43-304c-4f46-a179-6964ecf673ec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4702b68efb92","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f88e43-304c-4f46-a179-6964ecf673ec
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
Location: /v1/conversations/cnv_e12a3610-1492-47d2-b2e3-b3e023145de3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e12a3610-1492-47d2-b2e3-b3e023145de3","subject":"Error contract","status":"open","region":"eu","participants":["qa-e3333838910e","qa-4702b68efb92"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.976773689Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-19d4b4ed-822b-4a03-9c58-a2ff4f7dd654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d4b4ed-822b-4a03-9c58-a2ff4f7dd654
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-19d4b4ed-822b-4a03-9c58-a2ff4f7dd654
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0ee345dc-3438-48be-a1a2-d8921291a62d"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-2c1a675e-83e5-4459-9543-42fe58fa5214

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1a675e-83e5-4459-9543-42fe58fa5214
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c1a675e-83e5-4459-9543-42fe58fa5214
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

{"accounts":8,"conversations":3,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-62354253-577e-4875-814a-d991e375e5f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62354253-577e-4875-814a-d991e375e5f8
Content-Type: application/json

--- request body ---
{"handle":"qa-4702b68efb92","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-62354253-577e-4875-814a-d991e375e5f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fab07f0a-6da8-46cf-8b4f-eed58437dc3e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52172b1c-6810-4ce2-b257-c3f997907660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52172b1c-6810-4ce2-b257-c3f997907660
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52172b1c-6810-4ce2-b257-c3f997907660
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
correlation: qa-f0bf2ce1-152e-4f99-9315-0ee9c230aca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0bf2ce1-152e-4f99-9315-0ee9c230aca4
Content-Type: application/json

--- request body ---
{"handle":"qa-4702b68efb92","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0bf2ce1-152e-4f99-9315-0ee9c230aca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0bf2ce1-152e-4f99-9315-0ee9c230aca4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16dd5385-c5e8-4046-bf93-0947cfa38f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16dd5385-c5e8-4046-bf93-0947cfa38f5e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16dd5385-c5e8-4046-bf93-0947cfa38f5e
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
correlation: qa-61aa43e7-3658-4d9f-8750-053d88b6bab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61aa43e7-3658-4d9f-8750-053d88b6bab1
Content-Type: application/json

--- request body ---
{"handle":"qa-e3333838910e","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61aa43e7-3658-4d9f-8750-053d88b6bab1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61aa43e7-3658-4d9f-8750-053d88b6bab1"}
```
