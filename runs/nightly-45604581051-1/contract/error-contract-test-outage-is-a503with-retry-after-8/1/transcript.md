# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-127076b8-af9b-4269-b0b4-85d329be462d` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-ebf4647c-aa76-4ab2-a6ab-201f5b7b64a3` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-bffab15e-3f6c-43ab-9eea-bb5f00dbe06a` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-ca6344e3-0c94-4e53-a018-b053a6cff93b` |
| 5 | `GET /v1/conversations/{id}` | 503 | 22 | `qa-62c92ad4-a61f-4996-9fb9-29989a9dd465` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-ce2aca2a-3b4e-4aaf-8850-179173ddae5b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-fbefd8e0-c8d7-4efa-914b-360a081d0b0a` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-f13566ad-6979-4d21-ab90-a4865a77ceb2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-d1d94ba5-0a10-4a09-b071-e6cad15b8d75` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-1831cc67-adfa-419f-9173-b364a36dff37` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-127076b8-af9b-4269-b0b4-85d329be462d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-127076b8-af9b-4269-b0b4-85d329be462d
Content-Type: application/json

--- request body ---
{"handle":"qa-ca07795ea732","displayName":"QA ca07795ea732","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-127076b8-af9b-4269-b0b4-85d329be462d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Location: /v1/accounts/qa-ca07795ea732
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba762082-2d7c-448a-bdfe-5abe35ac47bf","handle":"qa-ca07795ea732","displayName":"QA ca07795ea732","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.780229501Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebf4647c-aa76-4ab2-a6ab-201f5b7b64a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebf4647c-aa76-4ab2-a6ab-201f5b7b64a3
Content-Type: application/json

--- request body ---
{"handle":"qa-1c3aa98bd413","displayName":"QA 1c3aa98bd413","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebf4647c-aa76-4ab2-a6ab-201f5b7b64a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-1c3aa98bd413
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26cfc74f-54ac-4b5e-97f0-ce165169017b","handle":"qa-1c3aa98bd413","displayName":"QA 1c3aa98bd413","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.845651314Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bffab15e-3f6c-43ab-9eea-bb5f00dbe06a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bffab15e-3f6c-43ab-9eea-bb5f00dbe06a
Content-Type: application/json

--- request body ---
{"handle":"qa-ca07795ea732","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bffab15e-3f6c-43ab-9eea-bb5f00dbe06a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba762082-2d7c-448a-bdfe-5abe35ac47bf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ca6344e3-0c94-4e53-a018-b053a6cff93b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca6344e3-0c94-4e53-a018-b053a6cff93b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c3aa98bd413","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca6344e3-0c94-4e53-a018-b053a6cff93b
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
Location: /v1/conversations/cnv_01521c96-6eee-4ff8-80fb-735a4d3156a8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_01521c96-6eee-4ff8-80fb-735a4d3156a8","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca07795ea732","qa-1c3aa98bd413"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.902129660Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_01521c96-6eee-4ff8-80fb-735a4d3156a8
correlation: qa-62c92ad4-a61f-4996-9fb9-29989a9dd465

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9270cbeb-0acd-40c7-82ba-37ce55a15400
X-Correlation-Id: qa-62c92ad4-a61f-4996-9fb9-29989a9dd465
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62c92ad4-a61f-4996-9fb9-29989a9dd465
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_01521c96-6eee-4ff8-80fb-735a4d3156a8","correlationId":"qa-62c92ad4-a61f-4996-9fb9-29989a9dd465"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ce2aca2a-3b4e-4aaf-8850-179173ddae5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2aca2a-3b4e-4aaf-8850-179173ddae5b
Content-Type: application/json

--- request body ---
{"handle":"qa-1c3aa98bd413","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce2aca2a-3b4e-4aaf-8850-179173ddae5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26cfc74f-54ac-4b5e-97f0-ce165169017b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbefd8e0-c8d7-4efa-914b-360a081d0b0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbefd8e0-c8d7-4efa-914b-360a081d0b0a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbefd8e0-c8d7-4efa-914b-360a081d0b0a
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
correlation: qa-f13566ad-6979-4d21-ab90-a4865a77ceb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f13566ad-6979-4d21-ab90-a4865a77ceb2
Content-Type: application/json

--- request body ---
{"handle":"qa-1c3aa98bd413","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f13566ad-6979-4d21-ab90-a4865a77ceb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f13566ad-6979-4d21-ab90-a4865a77ceb2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1d94ba5-0a10-4a09-b071-e6cad15b8d75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1d94ba5-0a10-4a09-b071-e6cad15b8d75
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1d94ba5-0a10-4a09-b071-e6cad15b8d75
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1831cc67-adfa-419f-9173-b364a36dff37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1831cc67-adfa-419f-9173-b364a36dff37
Content-Type: application/json

--- request body ---
{"handle":"qa-ca07795ea732","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1831cc67-adfa-419f-9173-b364a36dff37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1831cc67-adfa-419f-9173-b364a36dff37"}
```
