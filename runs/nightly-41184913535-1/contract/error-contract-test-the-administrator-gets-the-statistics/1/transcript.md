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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-a9fd8994-f9bd-4c43-a3c5-8f70c53376a7` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-24c114a9-b94e-4b0d-bbad-425944b3ac6f` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-4660c943-ab0a-429f-87fb-806f6338e26f` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-1d3a1613-b512-4b38-ab33-30b476b75c88` |
| 5 | `POST /v1/auth/token` | 200 | 22 | `qa-f7470aa2-2cf5-4a52-888b-0bdbf1da83f1` |
| 6 | `GET /v1/admin/stats` | 200 | 17 | `qa-9ef1602e-b1bf-4891-9c72-cada715e1caf` |
| 7 | `POST /v1/auth/token` | 200 | 22 | `qa-4f87ec3d-bd39-495d-b42d-660cd49042a2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b2af629f-1df1-4710-b7e0-666092bd73a9` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-1fe8cf9c-459d-4c19-bd07-570db06c2c66` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-68d81e79-a1c7-435a-a780-18f95ea72779` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-1d6f8fa3-776f-4f7e-92f0-44419af793d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9fd8994-f9bd-4c43-a3c5-8f70c53376a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9fd8994-f9bd-4c43-a3c5-8f70c53376a7
Content-Type: application/json

--- request body ---
{"handle":"qa-e4336baacbb4","displayName":"QA e4336baacbb4","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9fd8994-f9bd-4c43-a3c5-8f70c53376a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Location: /v1/accounts/qa-e4336baacbb4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b59b315-fd18-4b8c-b3c3-38d7907e000f","handle":"qa-e4336baacbb4","displayName":"QA e4336baacbb4","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.932804237Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-24c114a9-b94e-4b0d-bbad-425944b3ac6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24c114a9-b94e-4b0d-bbad-425944b3ac6f
Content-Type: application/json

--- request body ---
{"handle":"qa-5cb2f2392a77","displayName":"QA 5cb2f2392a77","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-24c114a9-b94e-4b0d-bbad-425944b3ac6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Location: /v1/accounts/qa-5cb2f2392a77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01ab02de-ca93-43b9-bb4f-a751781a6347","handle":"qa-5cb2f2392a77","displayName":"QA 5cb2f2392a77","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.957426118Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4660c943-ab0a-429f-87fb-806f6338e26f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4660c943-ab0a-429f-87fb-806f6338e26f
Content-Type: application/json

--- request body ---
{"handle":"qa-e4336baacbb4","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4660c943-ab0a-429f-87fb-806f6338e26f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b59b315-fd18-4b8c-b3c3-38d7907e000f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1d3a1613-b512-4b38-ab33-30b476b75c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d3a1613-b512-4b38-ab33-30b476b75c88
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5cb2f2392a77","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d3a1613-b512-4b38-ab33-30b476b75c88
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
Location: /v1/conversations/cnv_96cbd343-f8cd-4587-a0a1-ed0f6b596519
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96cbd343-f8cd-4587-a0a1-ed0f6b596519","subject":"Error contract","status":"open","region":"eu","participants":["qa-e4336baacbb4","qa-5cb2f2392a77"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.995268009Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f7470aa2-2cf5-4a52-888b-0bdbf1da83f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7470aa2-2cf5-4a52-888b-0bdbf1da83f1
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7470aa2-2cf5-4a52-888b-0bdbf1da83f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe7698f2-97bb-421c-ae3d-da9c56150125"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-9ef1602e-b1bf-4891-9c72-cada715e1caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ef1602e-b1bf-4891-9c72-cada715e1caf
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ef1602e-b1bf-4891-9c72-cada715e1caf
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

{"accounts":7,"conversations":3,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4f87ec3d-bd39-495d-b42d-660cd49042a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f87ec3d-bd39-495d-b42d-660cd49042a2
Content-Type: application/json

--- request body ---
{"handle":"qa-5cb2f2392a77","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f87ec3d-bd39-495d-b42d-660cd49042a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01ab02de-ca93-43b9-bb4f-a751781a6347"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2af629f-1df1-4710-b7e0-666092bd73a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2af629f-1df1-4710-b7e0-666092bd73a9
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2af629f-1df1-4710-b7e0-666092bd73a9
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
correlation: qa-1fe8cf9c-459d-4c19-bd07-570db06c2c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fe8cf9c-459d-4c19-bd07-570db06c2c66
Content-Type: application/json

--- request body ---
{"handle":"qa-5cb2f2392a77","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fe8cf9c-459d-4c19-bd07-570db06c2c66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1fe8cf9c-459d-4c19-bd07-570db06c2c66"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68d81e79-a1c7-435a-a780-18f95ea72779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68d81e79-a1c7-435a-a780-18f95ea72779
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68d81e79-a1c7-435a-a780-18f95ea72779
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
correlation: qa-1d6f8fa3-776f-4f7e-92f0-44419af793d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d6f8fa3-776f-4f7e-92f0-44419af793d4
Content-Type: application/json

--- request body ---
{"handle":"qa-e4336baacbb4","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d6f8fa3-776f-4f7e-92f0-44419af793d4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d6f8fa3-776f-4f7e-92f0-44419af793d4"}
```
