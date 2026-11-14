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
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-24ea4610-acd1-40f1-86a4-70a250fd1ee1` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-ce934a68-1f51-4506-9d8f-8c63a22af0ae` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-664fc575-ca7f-47ee-ae58-15075f3c8d10` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-71fc3be4-e437-40b4-8d54-41e88f8a33d1` |
| 5 | `POST /v1/auth/token` | 200 | 8 | `qa-a14e79ca-7165-40d2-a9e6-ab307f24e36a` |
| 6 | `GET /v1/admin/stats` | 200 | 15 | `qa-7da7823e-e599-4955-95df-d50e45323bdc` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-2fa2f343-f424-4d1e-982d-6768ee07d67b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d96896cf-61ac-4eb7-b588-b7023baabaf2` |
| 9 | `POST /v1/auth/token` | 401 | 3 | `qa-8e1e7c30-479b-49fa-a4f4-7d7c7dcefa4d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-adfc417c-ff7d-4d26-ac9e-d2d16bcbfaf6` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-f51caf9e-6852-408d-948d-a3bdbc5ebe82` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-24ea4610-acd1-40f1-86a4-70a250fd1ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ea4610-acd1-40f1-86a4-70a250fd1ee1
Content-Type: application/json

--- request body ---
{"handle":"qa-11902dd4c730","displayName":"QA 11902dd4c730","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-24ea4610-acd1-40f1-86a4-70a250fd1ee1
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
Location: /v1/accounts/qa-11902dd4c730
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22a1421e-f282-4c0c-952f-f46a45a87b0b","handle":"qa-11902dd4c730","displayName":"QA 11902dd4c730","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.120648196Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ce934a68-1f51-4506-9d8f-8c63a22af0ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce934a68-1f51-4506-9d8f-8c63a22af0ae
Content-Type: application/json

--- request body ---
{"handle":"qa-e37faabc7012","displayName":"QA e37faabc7012","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce934a68-1f51-4506-9d8f-8c63a22af0ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Location: /v1/accounts/qa-e37faabc7012
X-Served-Region: eu
Content-Length: 181

{"id":"acc_132e20b8-3d89-4742-adab-669b315899cd","handle":"qa-e37faabc7012","displayName":"QA e37faabc7012","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.139829793Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-664fc575-ca7f-47ee-ae58-15075f3c8d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-664fc575-ca7f-47ee-ae58-15075f3c8d10
Content-Type: application/json

--- request body ---
{"handle":"qa-11902dd4c730","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-664fc575-ca7f-47ee-ae58-15075f3c8d10
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22a1421e-f282-4c0c-952f-f46a45a87b0b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-71fc3be4-e437-40b4-8d54-41e88f8a33d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71fc3be4-e437-40b4-8d54-41e88f8a33d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e37faabc7012","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-71fc3be4-e437-40b4-8d54-41e88f8a33d1
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
Location: /v1/conversations/cnv_88b6b6be-e016-4ee0-887e-6a1f2a7b2509
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88b6b6be-e016-4ee0-887e-6a1f2a7b2509","subject":"Error contract","status":"open","region":"eu","participants":["qa-11902dd4c730","qa-e37faabc7012"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:04.184213239Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a14e79ca-7165-40d2-a9e6-ab307f24e36a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a14e79ca-7165-40d2-a9e6-ab307f24e36a
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a14e79ca-7165-40d2-a9e6-ab307f24e36a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7f774a2-0ad6-405e-96b0-0f15cfd61fb5"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-7da7823e-e599-4955-95df-d50e45323bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7da7823e-e599-4955-95df-d50e45323bdc
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7da7823e-e599-4955-95df-d50e45323bdc
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

{"accounts":8,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-2fa2f343-f424-4d1e-982d-6768ee07d67b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa2f343-f424-4d1e-982d-6768ee07d67b
Content-Type: application/json

--- request body ---
{"handle":"qa-e37faabc7012","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa2f343-f424-4d1e-982d-6768ee07d67b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_132e20b8-3d89-4742-adab-669b315899cd"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d96896cf-61ac-4eb7-b588-b7023baabaf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96896cf-61ac-4eb7-b588-b7023baabaf2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d96896cf-61ac-4eb7-b588-b7023baabaf2
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
correlation: qa-8e1e7c30-479b-49fa-a4f4-7d7c7dcefa4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1e7c30-479b-49fa-a4f4-7d7c7dcefa4d
Content-Type: application/json

--- request body ---
{"handle":"qa-e37faabc7012","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e1e7c30-479b-49fa-a4f4-7d7c7dcefa4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e1e7c30-479b-49fa-a4f4-7d7c7dcefa4d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adfc417c-ff7d-4d26-ac9e-d2d16bcbfaf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adfc417c-ff7d-4d26-ac9e-d2d16bcbfaf6
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adfc417c-ff7d-4d26-ac9e-d2d16bcbfaf6
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
correlation: qa-f51caf9e-6852-408d-948d-a3bdbc5ebe82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f51caf9e-6852-408d-948d-a3bdbc5ebe82
Content-Type: application/json

--- request body ---
{"handle":"qa-11902dd4c730","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f51caf9e-6852-408d-948d-a3bdbc5ebe82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f51caf9e-6852-408d-948d-a3bdbc5ebe82"}
```
