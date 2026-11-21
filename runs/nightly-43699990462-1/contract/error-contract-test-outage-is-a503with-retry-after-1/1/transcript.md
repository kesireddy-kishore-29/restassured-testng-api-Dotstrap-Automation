# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-357b46a4-11b7-4518-81bf-7f15e27452b9` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-5af9c77c-f52c-423c-a12b-9784da448d63` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-4555f4b8-d241-4989-92dc-6fccd267524c` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-17ebaf17-a297-4c49-a9f5-1db2bc0db0a6` |
| 5 | `POST /v1/accounts` | 503 | 15 | `qa-cb88a457-d296-4d68-82a5-c7a371267831` |
| 6 | `POST /v1/auth/token` | 200 | 87 | `qa-4415057e-4ffb-4af8-b467-c348d4b4840b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-b8e445b6-e22e-43e8-bc13-13bedfc414ae` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-fefd39f3-ac46-4998-94c1-e86f6ec75a3d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5943b625-42f1-4e1b-9e52-af390a41f575` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4b938275-997b-4bf7-a4b4-a5cb9eec34a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-357b46a4-11b7-4518-81bf-7f15e27452b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-357b46a4-11b7-4518-81bf-7f15e27452b9
Content-Type: application/json

--- request body ---
{"handle":"qa-c1d547f41df1","displayName":"QA c1d547f41df1","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-357b46a4-11b7-4518-81bf-7f15e27452b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-c1d547f41df1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cec1f6e4-8868-4f70-9435-0e110e6b3a6b","handle":"qa-c1d547f41df1","displayName":"QA c1d547f41df1","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.069546925Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5af9c77c-f52c-423c-a12b-9784da448d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af9c77c-f52c-423c-a12b-9784da448d63
Content-Type: application/json

--- request body ---
{"handle":"qa-505d0e9e57d1","displayName":"QA 505d0e9e57d1","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5af9c77c-f52c-423c-a12b-9784da448d63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-505d0e9e57d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3aff483-f30e-472b-a379-abc0d9f316d0","handle":"qa-505d0e9e57d1","displayName":"QA 505d0e9e57d1","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.121756032Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4555f4b8-d241-4989-92dc-6fccd267524c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4555f4b8-d241-4989-92dc-6fccd267524c
Content-Type: application/json

--- request body ---
{"handle":"qa-c1d547f41df1","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4555f4b8-d241-4989-92dc-6fccd267524c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cec1f6e4-8868-4f70-9435-0e110e6b3a6b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-17ebaf17-a297-4c49-a9f5-1db2bc0db0a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ebaf17-a297-4c49-a9f5-1db2bc0db0a6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-505d0e9e57d1","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-17ebaf17-a297-4c49-a9f5-1db2bc0db0a6
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
Location: /v1/conversations/cnv_31ad5fb5-a131-4b49-a349-d45ffa02d017
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_31ad5fb5-a131-4b49-a349-d45ffa02d017","subject":"Error contract","status":"open","region":"eu","participants":["qa-c1d547f41df1","qa-505d0e9e57d1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.204801546Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-cb88a457-d296-4d68-82a5-c7a371267831

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1acd1b5a-beae-458f-b5bc-083b8fb83ea6
X-Correlation-Id: qa-cb88a457-d296-4d68-82a5-c7a371267831
Content-Type: application/json

--- request body ---
{"handle":"qa-590129ad21ba","displayName":"QA 590129ad21ba","password":"****","region":"eu"}

--- response: 503 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb88a457-d296-4d68-82a5-c7a371267831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-cb88a457-d296-4d68-82a5-c7a371267831"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4415057e-4ffb-4af8-b467-c348d4b4840b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4415057e-4ffb-4af8-b467-c348d4b4840b
Content-Type: application/json

--- request body ---
{"handle":"qa-505d0e9e57d1","password":"****"}

--- response: 200 in 87 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4415057e-4ffb-4af8-b467-c348d4b4840b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3aff483-f30e-472b-a379-abc0d9f316d0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8e445b6-e22e-43e8-bc13-13bedfc414ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8e445b6-e22e-43e8-bc13-13bedfc414ae
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8e445b6-e22e-43e8-bc13-13bedfc414ae
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
correlation: qa-fefd39f3-ac46-4998-94c1-e86f6ec75a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fefd39f3-ac46-4998-94c1-e86f6ec75a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-505d0e9e57d1","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fefd39f3-ac46-4998-94c1-e86f6ec75a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fefd39f3-ac46-4998-94c1-e86f6ec75a3d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5943b625-42f1-4e1b-9e52-af390a41f575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5943b625-42f1-4e1b-9e52-af390a41f575
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5943b625-42f1-4e1b-9e52-af390a41f575
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4b938275-997b-4bf7-a4b4-a5cb9eec34a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b938275-997b-4bf7-a4b4-a5cb9eec34a1
Content-Type: application/json

--- request body ---
{"handle":"qa-c1d547f41df1","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b938275-997b-4bf7-a4b4-a5cb9eec34a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b938275-997b-4bf7-a4b4-a5cb9eec34a1"}
```
