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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-0a862b51-74fb-4529-a6af-424aece386dc` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-04dbbee8-00e4-4683-8bad-ef343b3f9a48` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-be116491-5c18-441f-a97d-1025353e916b` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-76511338-abbf-4ad5-b33e-9040e7b0de80` |
| 5 | `POST /v1/auth/token` | 200 | 24 | `qa-ccb4d175-baa3-494a-bcd8-efb4af9814b2` |
| 6 | `GET /v1/admin/stats` | 200 | 18 | `qa-9618c1a6-979a-47e1-a6c5-70955c435ae1` |
| 7 | `POST /v1/auth/token` | 200 | 22 | `qa-37240ec3-47fa-4554-aa84-09f98d0a532b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-94e1aaa2-d31e-47e8-adcc-d7cbdf51bff6` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-d5d9eed1-01f7-4a0e-b76a-45c186c78264` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e45e0818-454d-43d4-919e-c40c620b5395` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-91946b97-ee83-4057-8510-0c4331ff3366` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a862b51-74fb-4529-a6af-424aece386dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a862b51-74fb-4529-a6af-424aece386dc
Content-Type: application/json

--- request body ---
{"handle":"qa-d9592af5caae","displayName":"QA d9592af5caae","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a862b51-74fb-4529-a6af-424aece386dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 5
Location: /v1/accounts/qa-d9592af5caae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d165954a-53b0-45b3-940c-71d12b718fd2","handle":"qa-d9592af5caae","displayName":"QA d9592af5caae","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.560927759Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04dbbee8-00e4-4683-8bad-ef343b3f9a48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04dbbee8-00e4-4683-8bad-ef343b3f9a48
Content-Type: application/json

--- request body ---
{"handle":"qa-a5545077c54e","displayName":"QA a5545077c54e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-04dbbee8-00e4-4683-8bad-ef343b3f9a48
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
Location: /v1/accounts/qa-a5545077c54e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18097236-58db-423f-a1f4-8a66b485f6e7","handle":"qa-a5545077c54e","displayName":"QA a5545077c54e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.594758082Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be116491-5c18-441f-a97d-1025353e916b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be116491-5c18-441f-a97d-1025353e916b
Content-Type: application/json

--- request body ---
{"handle":"qa-d9592af5caae","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-be116491-5c18-441f-a97d-1025353e916b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d165954a-53b0-45b3-940c-71d12b718fd2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-76511338-abbf-4ad5-b33e-9040e7b0de80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76511338-abbf-4ad5-b33e-9040e7b0de80
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a5545077c54e","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-76511338-abbf-4ad5-b33e-9040e7b0de80
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
Location: /v1/conversations/cnv_66475c03-57e4-497c-9e97-9b8c75b4eb72
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_66475c03-57e4-497c-9e97-9b8c75b4eb72","subject":"Error contract","status":"open","region":"eu","participants":["qa-d9592af5caae","qa-a5545077c54e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:47.653297290Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ccb4d175-baa3-494a-bcd8-efb4af9814b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb4d175-baa3-494a-bcd8-efb4af9814b2
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccb4d175-baa3-494a-bcd8-efb4af9814b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e67f34e-d666-44fb-9c7b-8736fe277e0c"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-9618c1a6-979a-47e1-a6c5-70955c435ae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9618c1a6-979a-47e1-a6c5-70955c435ae1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9618c1a6-979a-47e1-a6c5-70955c435ae1
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
correlation: qa-37240ec3-47fa-4554-aa84-09f98d0a532b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37240ec3-47fa-4554-aa84-09f98d0a532b
Content-Type: application/json

--- request body ---
{"handle":"qa-a5545077c54e","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-37240ec3-47fa-4554-aa84-09f98d0a532b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18097236-58db-423f-a1f4-8a66b485f6e7"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94e1aaa2-d31e-47e8-adcc-d7cbdf51bff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94e1aaa2-d31e-47e8-adcc-d7cbdf51bff6
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94e1aaa2-d31e-47e8-adcc-d7cbdf51bff6
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
correlation: qa-d5d9eed1-01f7-4a0e-b76a-45c186c78264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5d9eed1-01f7-4a0e-b76a-45c186c78264
Content-Type: application/json

--- request body ---
{"handle":"qa-a5545077c54e","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5d9eed1-01f7-4a0e-b76a-45c186c78264
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5d9eed1-01f7-4a0e-b76a-45c186c78264"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e45e0818-454d-43d4-919e-c40c620b5395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e45e0818-454d-43d4-919e-c40c620b5395
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e45e0818-454d-43d4-919e-c40c620b5395
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
correlation: qa-91946b97-ee83-4057-8510-0c4331ff3366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91946b97-ee83-4057-8510-0c4331ff3366
Content-Type: application/json

--- request body ---
{"handle":"qa-d9592af5caae","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91946b97-ee83-4057-8510-0c4331ff3366
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91946b97-ee83-4057-8510-0c4331ff3366"}
```
