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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-37c62a6d-6a6f-4cba-82c0-acf79cf4c530` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-43ae7dc2-157d-4d72-8c54-5ff037956aa6` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-e2420df2-cb87-46db-afaa-34d95e075f03` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-39140b4a-6880-42b3-9264-01d0e239cf79` |
| 5 | `POST /v1/auth/token` | 200 | 10 | `qa-d34b70e9-afb1-400f-9b96-0e7f86cab06f` |
| 6 | `GET /v1/admin/stats` | 200 | 11 | `qa-088ee148-6477-4fe5-952a-1b2bb523eef4` |
| 7 | `POST /v1/auth/token` | 200 | 11 | `qa-feb5806a-99a4-49dc-bda8-6d0234b4c81c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f16e3201-cbbe-436c-b49a-cb09fc717224` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-3d4ad149-f839-4775-ad9c-79084e501cb7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-5422bbc6-0664-4830-a746-7c29781992b8` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-3fd7ecf8-dd7b-4b4a-b893-219e19c9c9c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-37c62a6d-6a6f-4cba-82c0-acf79cf4c530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c62a6d-6a6f-4cba-82c0-acf79cf4c530
Content-Type: application/json

--- request body ---
{"handle":"qa-1141ca013008","displayName":"QA 1141ca013008","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-37c62a6d-6a6f-4cba-82c0-acf79cf4c530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 8
Location: /v1/accounts/qa-1141ca013008
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ff4e975-e2e0-47d6-9373-28758c1a8572","handle":"qa-1141ca013008","displayName":"QA 1141ca013008","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.694708225Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-43ae7dc2-157d-4d72-8c54-5ff037956aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ae7dc2-157d-4d72-8c54-5ff037956aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-2878a1a21330","displayName":"QA 2878a1a21330","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-43ae7dc2-157d-4d72-8c54-5ff037956aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 8
Location: /v1/accounts/qa-2878a1a21330
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f542c75-9c3f-4499-b200-dc862e3f730d","handle":"qa-2878a1a21330","displayName":"QA 2878a1a21330","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.711560325Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e2420df2-cb87-46db-afaa-34d95e075f03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2420df2-cb87-46db-afaa-34d95e075f03
Content-Type: application/json

--- request body ---
{"handle":"qa-1141ca013008","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2420df2-cb87-46db-afaa-34d95e075f03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ff4e975-e2e0-47d6-9373-28758c1a8572"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39140b4a-6880-42b3-9264-01d0e239cf79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39140b4a-6880-42b3-9264-01d0e239cf79
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2878a1a21330","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-39140b4a-6880-42b3-9264-01d0e239cf79
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
Location: /v1/conversations/cnv_8181422c-457f-4561-a6be-05a414559ce9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8181422c-457f-4561-a6be-05a414559ce9","subject":"Error contract","status":"open","region":"eu","participants":["qa-1141ca013008","qa-2878a1a21330"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.752093969Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d34b70e9-afb1-400f-9b96-0e7f86cab06f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d34b70e9-afb1-400f-9b96-0e7f86cab06f
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d34b70e9-afb1-400f-9b96-0e7f86cab06f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7748ef16-e255-4411-9094-8a9db2234892"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-088ee148-6477-4fe5-952a-1b2bb523eef4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-088ee148-6477-4fe5-952a-1b2bb523eef4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-088ee148-6477-4fe5-952a-1b2bb523eef4
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
Content-Length: 47

{"accounts":10,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-feb5806a-99a4-49dc-bda8-6d0234b4c81c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feb5806a-99a4-49dc-bda8-6d0234b4c81c
Content-Type: application/json

--- request body ---
{"handle":"qa-2878a1a21330","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-feb5806a-99a4-49dc-bda8-6d0234b4c81c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f542c75-9c3f-4499-b200-dc862e3f730d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f16e3201-cbbe-436c-b49a-cb09fc717224

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f16e3201-cbbe-436c-b49a-cb09fc717224
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f16e3201-cbbe-436c-b49a-cb09fc717224
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
correlation: qa-3d4ad149-f839-4775-ad9c-79084e501cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4ad149-f839-4775-ad9c-79084e501cb7
Content-Type: application/json

--- request body ---
{"handle":"qa-2878a1a21330","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d4ad149-f839-4775-ad9c-79084e501cb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d4ad149-f839-4775-ad9c-79084e501cb7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5422bbc6-0664-4830-a746-7c29781992b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5422bbc6-0664-4830-a746-7c29781992b8
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5422bbc6-0664-4830-a746-7c29781992b8
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
correlation: qa-3fd7ecf8-dd7b-4b4a-b893-219e19c9c9c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd7ecf8-dd7b-4b4a-b893-219e19c9c9c5
Content-Type: application/json

--- request body ---
{"handle":"qa-1141ca013008","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fd7ecf8-dd7b-4b4a-b893-219e19c9c9c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3fd7ecf8-dd7b-4b4a-b893-219e19c9c9c5"}
```
