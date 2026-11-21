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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-ec6d9a60-86a7-4c3c-b9ce-e8e80930cca2` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-c993ddee-f542-4b25-98c1-6c0edebec072` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-3f57cff9-59fa-4f15-ab6e-46be6aef5da5` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-b0285579-1083-4b3e-bbc9-ff48a2b6b1b6` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-f81db010-da20-4b88-99cc-9dbf3792fc83` |
| 6 | `GET /v1/admin/stats` | 200 | 12 | `qa-04ed079e-cd05-44df-88ff-41be864c0e93` |
| 7 | `POST /v1/auth/token` | 200 | 12 | `qa-e0af84b7-d42f-4cf5-ba17-f2e11abbbcba` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-7f37e5ea-7dc1-41db-a0ee-e0f3521334f7` |
| 9 | `POST /v1/auth/token` | 401 | 59 | `qa-c1f83146-fca2-4c42-9e8f-55d0b0b3271a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6732b47c-59ac-4ea8-afba-55995cdd9ef5` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-30715c49-797e-4daf-b1c7-c24b7a6cd933` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec6d9a60-86a7-4c3c-b9ce-e8e80930cca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec6d9a60-86a7-4c3c-b9ce-e8e80930cca2
Content-Type: application/json

--- request body ---
{"handle":"qa-d9074ad1fba3","displayName":"QA d9074ad1fba3","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec6d9a60-86a7-4c3c-b9ce-e8e80930cca2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Location: /v1/accounts/qa-d9074ad1fba3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab49e89b-3574-4b11-a6de-9c37c2182e5c","handle":"qa-d9074ad1fba3","displayName":"QA d9074ad1fba3","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.998851764Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c993ddee-f542-4b25-98c1-6c0edebec072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c993ddee-f542-4b25-98c1-6c0edebec072
Content-Type: application/json

--- request body ---
{"handle":"qa-689fc0fef88a","displayName":"QA 689fc0fef88a","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c993ddee-f542-4b25-98c1-6c0edebec072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Location: /v1/accounts/qa-689fc0fef88a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b43c2951-46ab-4ccf-8ddb-633303983a7d","handle":"qa-689fc0fef88a","displayName":"QA 689fc0fef88a","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.016588462Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f57cff9-59fa-4f15-ab6e-46be6aef5da5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f57cff9-59fa-4f15-ab6e-46be6aef5da5
Content-Type: application/json

--- request body ---
{"handle":"qa-d9074ad1fba3","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f57cff9-59fa-4f15-ab6e-46be6aef5da5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab49e89b-3574-4b11-a6de-9c37c2182e5c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b0285579-1083-4b3e-bbc9-ff48a2b6b1b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0285579-1083-4b3e-bbc9-ff48a2b6b1b6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-689fc0fef88a","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0285579-1083-4b3e-bbc9-ff48a2b6b1b6
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
Location: /v1/conversations/cnv_6b21d459-dbf7-4e51-b0cb-73463bc6bfa1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b21d459-dbf7-4e51-b0cb-73463bc6bfa1","subject":"Error contract","status":"open","region":"eu","participants":["qa-d9074ad1fba3","qa-689fc0fef88a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:13.056598410Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f81db010-da20-4b88-99cc-9dbf3792fc83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f81db010-da20-4b88-99cc-9dbf3792fc83
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f81db010-da20-4b88-99cc-9dbf3792fc83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c632e3a-78ac-4851-b25e-f26b8155be18"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-04ed079e-cd05-44df-88ff-41be864c0e93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ed079e-cd05-44df-88ff-41be864c0e93
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-04ed079e-cd05-44df-88ff-41be864c0e93
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
correlation: qa-e0af84b7-d42f-4cf5-ba17-f2e11abbbcba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0af84b7-d42f-4cf5-ba17-f2e11abbbcba
Content-Type: application/json

--- request body ---
{"handle":"qa-689fc0fef88a","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0af84b7-d42f-4cf5-ba17-f2e11abbbcba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b43c2951-46ab-4ccf-8ddb-633303983a7d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f37e5ea-7dc1-41db-a0ee-e0f3521334f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f37e5ea-7dc1-41db-a0ee-e0f3521334f7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f37e5ea-7dc1-41db-a0ee-e0f3521334f7
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
correlation: qa-c1f83146-fca2-4c42-9e8f-55d0b0b3271a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1f83146-fca2-4c42-9e8f-55d0b0b3271a
Content-Type: application/json

--- request body ---
{"handle":"qa-689fc0fef88a","password":"****"}

--- response: 401 in 59 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1f83146-fca2-4c42-9e8f-55d0b0b3271a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1f83146-fca2-4c42-9e8f-55d0b0b3271a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6732b47c-59ac-4ea8-afba-55995cdd9ef5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6732b47c-59ac-4ea8-afba-55995cdd9ef5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6732b47c-59ac-4ea8-afba-55995cdd9ef5
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
correlation: qa-30715c49-797e-4daf-b1c7-c24b7a6cd933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30715c49-797e-4daf-b1c7-c24b7a6cd933
Content-Type: application/json

--- request body ---
{"handle":"qa-d9074ad1fba3","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30715c49-797e-4daf-b1c7-c24b7a6cd933
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30715c49-797e-4daf-b1c7-c24b7a6cd933"}
```
