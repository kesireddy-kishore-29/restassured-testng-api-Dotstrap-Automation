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
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-c5f2f232-9286-4253-bcfd-40a73d58a011` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-89ee6f68-cf1f-48df-8f44-880724b615f1` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-b2564449-3bc0-4d7c-aa13-217269a24102` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-658ec157-19fb-4e41-8c94-24663043219b` |
| 5 | `PATCH /v1/accounts/me` | 400 | 12 | `qa-003b7a3f-412c-4506-924a-cf0d088f7df2` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-dc945586-b08f-4bad-bb47-f1159783c780` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-59b13aa6-cc3d-4dc3-aebd-67db4831fcf0` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-baa426ec-cd54-4a5c-b6ad-dd847c316016` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1d143525-565e-4254-9a48-f93e824ca582` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-c8916e41-0e8b-4e7d-9078-8f7152f27efa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c5f2f232-9286-4253-bcfd-40a73d58a011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f2f232-9286-4253-bcfd-40a73d58a011
Content-Type: application/json

--- request body ---
{"handle":"qa-15103d6aa9fa","displayName":"QA 15103d6aa9fa","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5f2f232-9286-4253-bcfd-40a73d58a011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Location: /v1/accounts/qa-15103d6aa9fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9cc714a-8b21-440b-8ba8-e50e63b25237","handle":"qa-15103d6aa9fa","displayName":"QA 15103d6aa9fa","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.888290573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-89ee6f68-cf1f-48df-8f44-880724b615f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89ee6f68-cf1f-48df-8f44-880724b615f1
Content-Type: application/json

--- request body ---
{"handle":"qa-19d2bb87885a","displayName":"QA 19d2bb87885a","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-89ee6f68-cf1f-48df-8f44-880724b615f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 9
Location: /v1/accounts/qa-19d2bb87885a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_70491999-b940-42bb-8e92-db39530699da","handle":"qa-19d2bb87885a","displayName":"QA 19d2bb87885a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.939449950Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b2564449-3bc0-4d7c-aa13-217269a24102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2564449-3bc0-4d7c-aa13-217269a24102
Content-Type: application/json

--- request body ---
{"handle":"qa-15103d6aa9fa","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2564449-3bc0-4d7c-aa13-217269a24102
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9cc714a-8b21-440b-8ba8-e50e63b25237"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-658ec157-19fb-4e41-8c94-24663043219b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-658ec157-19fb-4e41-8c94-24663043219b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-19d2bb87885a","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-658ec157-19fb-4e41-8c94-24663043219b
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
Location: /v1/conversations/cnv_94069f6e-c6be-4024-802a-9a99318e849d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_94069f6e-c6be-4024-802a-9a99318e849d","subject":"Error contract","status":"open","region":"eu","participants":["qa-15103d6aa9fa","qa-19d2bb87885a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.993612819Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-003b7a3f-412c-4506-924a-cf0d088f7df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003b7a3f-412c-4506-924a-cf0d088f7df2
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-003b7a3f-412c-4506-924a-cf0d088f7df2
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-003b7a3f-412c-4506-924a-cf0d088f7df2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc945586-b08f-4bad-bb47-f1159783c780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc945586-b08f-4bad-bb47-f1159783c780
Content-Type: application/json

--- request body ---
{"handle":"qa-19d2bb87885a","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc945586-b08f-4bad-bb47-f1159783c780
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_70491999-b940-42bb-8e92-db39530699da"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59b13aa6-cc3d-4dc3-aebd-67db4831fcf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b13aa6-cc3d-4dc3-aebd-67db4831fcf0
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59b13aa6-cc3d-4dc3-aebd-67db4831fcf0
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
correlation: qa-baa426ec-cd54-4a5c-b6ad-dd847c316016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa426ec-cd54-4a5c-b6ad-dd847c316016
Content-Type: application/json

--- request body ---
{"handle":"qa-19d2bb87885a","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-baa426ec-cd54-4a5c-b6ad-dd847c316016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-baa426ec-cd54-4a5c-b6ad-dd847c316016"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d143525-565e-4254-9a48-f93e824ca582

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d143525-565e-4254-9a48-f93e824ca582
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d143525-565e-4254-9a48-f93e824ca582
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
correlation: qa-c8916e41-0e8b-4e7d-9078-8f7152f27efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8916e41-0e8b-4e7d-9078-8f7152f27efa
Content-Type: application/json

--- request body ---
{"handle":"qa-15103d6aa9fa","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8916e41-0e8b-4e7d-9078-8f7152f27efa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8916e41-0e8b-4e7d-9078-8f7152f27efa"}
```
