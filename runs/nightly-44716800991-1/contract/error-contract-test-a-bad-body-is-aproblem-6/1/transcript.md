# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-f1040502-791f-479e-b39e-ca3126b906d6` |
| 2 | `POST /v1/accounts` | 201 | 84 | `qa-0eeefdeb-58db-4b93-a45c-3e95b81400bf` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-a51f02af-f142-45b8-ad4e-6fa0a2d48fda` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-5a721e8b-3d8e-445b-bb81-0ed58920c4e3` |
| 5 | `PATCH /v1/accounts/me` | 400 | 28 | `qa-80ffba06-6492-4947-b49f-3c7d32c793cd` |
| 6 | `POST /v1/auth/token` | 200 | 66 | `qa-57aef66e-d853-46a8-bf99-0e01f53efdb1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-68459157-e7e6-4f65-b796-b97569fa55f1` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-51275e4d-e1ee-4e5e-805b-f321fdaebbaa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-04553353-60c7-4305-88cf-0728d48014bb` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-8f28b7c2-0ef0-4ad0-a7af-8dde0796fb97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1040502-791f-479e-b39e-ca3126b906d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1040502-791f-479e-b39e-ca3126b906d6
Content-Type: application/json

--- request body ---
{"handle":"qa-151f5f22b7ec","displayName":"QA 151f5f22b7ec","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1040502-791f-479e-b39e-ca3126b906d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-151f5f22b7ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d52adb0b-d715-49ca-80cc-a29ce46b241c","handle":"qa-151f5f22b7ec","displayName":"QA 151f5f22b7ec","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.224920034Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0eeefdeb-58db-4b93-a45c-3e95b81400bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eeefdeb-58db-4b93-a45c-3e95b81400bf
Content-Type: application/json

--- request body ---
{"handle":"qa-442d1df8d903","displayName":"QA 442d1df8d903","password":"****","region":"eu"}

--- response: 201 in 84 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eeefdeb-58db-4b93-a45c-3e95b81400bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Location: /v1/accounts/qa-442d1df8d903
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6733dad3-6473-4a0e-9e75-9f774e86a120","handle":"qa-442d1df8d903","displayName":"QA 442d1df8d903","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.313036897Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a51f02af-f142-45b8-ad4e-6fa0a2d48fda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a51f02af-f142-45b8-ad4e-6fa0a2d48fda
Content-Type: application/json

--- request body ---
{"handle":"qa-151f5f22b7ec","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a51f02af-f142-45b8-ad4e-6fa0a2d48fda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d52adb0b-d715-49ca-80cc-a29ce46b241c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5a721e8b-3d8e-445b-bb81-0ed58920c4e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a721e8b-3d8e-445b-bb81-0ed58920c4e3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-442d1df8d903","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a721e8b-3d8e-445b-bb81-0ed58920c4e3
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
Location: /v1/conversations/cnv_517a3ed1-dc0c-4078-99b3-06b37ef0fec9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_517a3ed1-dc0c-4078-99b3-06b37ef0fec9","subject":"Error contract","status":"open","region":"eu","participants":["qa-151f5f22b7ec","qa-442d1df8d903"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.433009685Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-80ffba06-6492-4947-b49f-3c7d32c793cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80ffba06-6492-4947-b49f-3c7d32c793cd
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80ffba06-6492-4947-b49f-3c7d32c793cd
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-80ffba06-6492-4947-b49f-3c7d32c793cd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-57aef66e-d853-46a8-bf99-0e01f53efdb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57aef66e-d853-46a8-bf99-0e01f53efdb1
Content-Type: application/json

--- request body ---
{"handle":"qa-442d1df8d903","password":"****"}

--- response: 200 in 66 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-57aef66e-d853-46a8-bf99-0e01f53efdb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6733dad3-6473-4a0e-9e75-9f774e86a120"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68459157-e7e6-4f65-b796-b97569fa55f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68459157-e7e6-4f65-b796-b97569fa55f1
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68459157-e7e6-4f65-b796-b97569fa55f1
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
correlation: qa-51275e4d-e1ee-4e5e-805b-f321fdaebbaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51275e4d-e1ee-4e5e-805b-f321fdaebbaa
Content-Type: application/json

--- request body ---
{"handle":"qa-442d1df8d903","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51275e4d-e1ee-4e5e-805b-f321fdaebbaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51275e4d-e1ee-4e5e-805b-f321fdaebbaa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04553353-60c7-4305-88cf-0728d48014bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04553353-60c7-4305-88cf-0728d48014bb
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04553353-60c7-4305-88cf-0728d48014bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8f28b7c2-0ef0-4ad0-a7af-8dde0796fb97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f28b7c2-0ef0-4ad0-a7af-8dde0796fb97
Content-Type: application/json

--- request body ---
{"handle":"qa-151f5f22b7ec","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f28b7c2-0ef0-4ad0-a7af-8dde0796fb97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f28b7c2-0ef0-4ad0-a7af-8dde0796fb97"}
```
