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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-0718298a-dbbe-44f2-98fb-169d23ed8aa8` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-caecbd28-1502-44ae-851a-07c76367c573` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-d15366b3-8bdd-4a6b-816b-e16aefc0e67e` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-f3c1eb17-ea7c-4240-b31c-77380035d6a2` |
| 5 | `POST /v1/auth/token` | 200 | 19 | `qa-3c779bb2-9ecd-4cac-a2d0-3e312cb088c9` |
| 6 | `GET /v1/admin/stats` | 200 | 26 | `qa-7419f3e7-d757-4898-a227-4d16d7365742` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-db92b9ea-9c5f-4741-8b96-d59fd092ccb2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-5f7c5da1-8dd1-4203-b982-f748941674b0` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-27eaf8d6-6658-4cc4-a87e-dd53132915dd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-4b4643a9-8cfd-4cf4-92bc-c2db57f55cce` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-9734ed79-2d38-4874-9750-53a625d1a785` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0718298a-dbbe-44f2-98fb-169d23ed8aa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0718298a-dbbe-44f2-98fb-169d23ed8aa8
Content-Type: application/json

--- request body ---
{"handle":"qa-adc4b9ba843a","displayName":"QA adc4b9ba843a","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0718298a-dbbe-44f2-98fb-169d23ed8aa8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Location: /v1/accounts/qa-adc4b9ba843a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76fc76a6-85dc-4396-9a47-41b5ef8677a8","handle":"qa-adc4b9ba843a","displayName":"QA adc4b9ba843a","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.761617303Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-caecbd28-1502-44ae-851a-07c76367c573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caecbd28-1502-44ae-851a-07c76367c573
Content-Type: application/json

--- request body ---
{"handle":"qa-93a72e6c4aa8","displayName":"QA 93a72e6c4aa8","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-caecbd28-1502-44ae-851a-07c76367c573
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Location: /v1/accounts/qa-93a72e6c4aa8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ddd979a4-c720-4049-9620-7236f28f98ad","handle":"qa-93a72e6c4aa8","displayName":"QA 93a72e6c4aa8","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.781431905Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d15366b3-8bdd-4a6b-816b-e16aefc0e67e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15366b3-8bdd-4a6b-816b-e16aefc0e67e
Content-Type: application/json

--- request body ---
{"handle":"qa-adc4b9ba843a","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d15366b3-8bdd-4a6b-816b-e16aefc0e67e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76fc76a6-85dc-4396-9a47-41b5ef8677a8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f3c1eb17-ea7c-4240-b31c-77380035d6a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3c1eb17-ea7c-4240-b31c-77380035d6a2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93a72e6c4aa8","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3c1eb17-ea7c-4240-b31c-77380035d6a2
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
Location: /v1/conversations/cnv_cdfcb5ed-3198-4e0f-9a13-fd9300e37ffb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cdfcb5ed-3198-4e0f-9a13-fd9300e37ffb","subject":"Error contract","status":"open","region":"eu","participants":["qa-adc4b9ba843a","qa-93a72e6c4aa8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.825146765Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3c779bb2-9ecd-4cac-a2d0-3e312cb088c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c779bb2-9ecd-4cac-a2d0-3e312cb088c9
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c779bb2-9ecd-4cac-a2d0-3e312cb088c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f055edd5-b5e5-4a24-889d-6caec013638a"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-7419f3e7-d757-4898-a227-4d16d7365742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7419f3e7-d757-4898-a227-4d16d7365742
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7419f3e7-d757-4898-a227-4d16d7365742
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
correlation: qa-db92b9ea-9c5f-4741-8b96-d59fd092ccb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db92b9ea-9c5f-4741-8b96-d59fd092ccb2
Content-Type: application/json

--- request body ---
{"handle":"qa-93a72e6c4aa8","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-db92b9ea-9c5f-4741-8b96-d59fd092ccb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ddd979a4-c720-4049-9620-7236f28f98ad"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f7c5da1-8dd1-4203-b982-f748941674b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f7c5da1-8dd1-4203-b982-f748941674b0
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f7c5da1-8dd1-4203-b982-f748941674b0
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
correlation: qa-27eaf8d6-6658-4cc4-a87e-dd53132915dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27eaf8d6-6658-4cc4-a87e-dd53132915dd
Content-Type: application/json

--- request body ---
{"handle":"qa-93a72e6c4aa8","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27eaf8d6-6658-4cc4-a87e-dd53132915dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27eaf8d6-6658-4cc4-a87e-dd53132915dd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b4643a9-8cfd-4cf4-92bc-c2db57f55cce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b4643a9-8cfd-4cf4-92bc-c2db57f55cce
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b4643a9-8cfd-4cf4-92bc-c2db57f55cce
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
correlation: qa-9734ed79-2d38-4874-9750-53a625d1a785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9734ed79-2d38-4874-9750-53a625d1a785
Content-Type: application/json

--- request body ---
{"handle":"qa-adc4b9ba843a","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9734ed79-2d38-4874-9750-53a625d1a785
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9734ed79-2d38-4874-9750-53a625d1a785"}
```
