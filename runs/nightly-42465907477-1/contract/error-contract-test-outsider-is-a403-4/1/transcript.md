# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-591ab8be-2edf-4990-9ff3-a0d334c8c813` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-f7883f8e-afff-4fc6-be62-e18e50c651e7` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-1a7938b2-0dec-482e-a934-0fc5d1ec05f0` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-69ff9a0c-472b-4716-924a-d8e2b9aa6910` |
| 5 | `POST /v1/conversations` | 201 | 27 | `qa-301d7205-a221-44b4-a15a-b998c87f39fa` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-d33eab13-d3f6-4aa4-a3f8-86b4766b0edb` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 8 | `qa-093f25a4-1400-4993-a9c5-9423fd3df142` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-71845f4e-a3e5-49ee-89bd-c7a981634f3f` |
| 9 | `POST /v1/auth/token` | 401 | 18 | `qa-935a80f3-b912-4a1d-9a26-806c376fba0e` |
| 10 | `POST /v1/auth/token` | 200 | 14 | `qa-33fb8bd0-b304-48cd-ab54-81b51c29e293` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c0ef44ef-2de2-44fa-b971-912af75fbb46` |
| 12 | `POST /v1/auth/token` | 401 | 19 | `qa-f3f19a39-3cb2-421f-a1cf-450075426946` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6d9228ad-0192-46bc-aacb-0e0cfdf47e6d` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-7b9107c8-66b3-487e-902a-143324004ba8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-591ab8be-2edf-4990-9ff3-a0d334c8c813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591ab8be-2edf-4990-9ff3-a0d334c8c813
Content-Type: application/json

--- request body ---
{"handle":"qa-e0a1cd6b822b","displayName":"QA e0a1cd6b822b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-591ab8be-2edf-4990-9ff3-a0d334c8c813
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 9
Location: /v1/accounts/qa-e0a1cd6b822b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7fab4c0-8fac-4833-bfa5-a18795bc62c8","handle":"qa-e0a1cd6b822b","displayName":"QA e0a1cd6b822b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.696980976Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f7883f8e-afff-4fc6-be62-e18e50c651e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7883f8e-afff-4fc6-be62-e18e50c651e7
Content-Type: application/json

--- request body ---
{"handle":"qa-7547b1e53a68","displayName":"QA 7547b1e53a68","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7883f8e-afff-4fc6-be62-e18e50c651e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 9
Location: /v1/accounts/qa-7547b1e53a68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18d1b223-03d0-414e-8e90-aa97c8f58ce7","handle":"qa-7547b1e53a68","displayName":"QA 7547b1e53a68","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.721506901Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1a7938b2-0dec-482e-a934-0fc5d1ec05f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a7938b2-0dec-482e-a934-0fc5d1ec05f0
Content-Type: application/json

--- request body ---
{"handle":"qa-9f134ceaaf29","displayName":"QA 9f134ceaaf29","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a7938b2-0dec-482e-a934-0fc5d1ec05f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 9
Location: /v1/accounts/qa-9f134ceaaf29
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3b2bbc1-d9ff-4fbb-a7fc-9792581907f9","handle":"qa-9f134ceaaf29","displayName":"QA 9f134ceaaf29","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.751263895Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-69ff9a0c-472b-4716-924a-d8e2b9aa6910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69ff9a0c-472b-4716-924a-d8e2b9aa6910
Content-Type: application/json

--- request body ---
{"handle":"qa-e0a1cd6b822b","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-69ff9a0c-472b-4716-924a-d8e2b9aa6910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7fab4c0-8fac-4833-bfa5-a18795bc62c8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-301d7205-a221-44b4-a15a-b998c87f39fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-301d7205-a221-44b4-a15a-b998c87f39fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7547b1e53a68","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-301d7205-a221-44b4-a15a-b998c87f39fa
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
Location: /v1/conversations/cnv_e5872d54-837b-46e9-a42b-3caba2b61ae8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e5872d54-837b-46e9-a42b-3caba2b61ae8","subject":"Error contract","status":"open","region":"eu","participants":["qa-e0a1cd6b822b","qa-7547b1e53a68"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.814751452Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d33eab13-d3f6-4aa4-a3f8-86b4766b0edb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d33eab13-d3f6-4aa4-a3f8-86b4766b0edb
Content-Type: application/json

--- request body ---
{"handle":"qa-9f134ceaaf29","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d33eab13-d3f6-4aa4-a3f8-86b4766b0edb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3b2bbc1-d9ff-4fbb-a7fc-9792581907f9"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e5872d54-837b-46e9-a42b-3caba2b61ae8/close
correlation: qa-093f25a4-1400-4993-a9c5-9423fd3df142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093f25a4-1400-4993-a9c5-9423fd3df142
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-093f25a4-1400-4993-a9c5-9423fd3df142
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_e5872d54-837b-46e9-a42b-3caba2b61ae8/close","correlationId":"qa-093f25a4-1400-4993-a9c5-9423fd3df142"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71845f4e-a3e5-49ee-89bd-c7a981634f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71845f4e-a3e5-49ee-89bd-c7a981634f3f
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71845f4e-a3e5-49ee-89bd-c7a981634f3f
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-935a80f3-b912-4a1d-9a26-806c376fba0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-935a80f3-b912-4a1d-9a26-806c376fba0e
Content-Type: application/json

--- request body ---
{"handle":"qa-9f134ceaaf29","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-935a80f3-b912-4a1d-9a26-806c376fba0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-935a80f3-b912-4a1d-9a26-806c376fba0e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-33fb8bd0-b304-48cd-ab54-81b51c29e293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33fb8bd0-b304-48cd-ab54-81b51c29e293
Content-Type: application/json

--- request body ---
{"handle":"qa-7547b1e53a68","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-33fb8bd0-b304-48cd-ab54-81b51c29e293
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18d1b223-03d0-414e-8e90-aa97c8f58ce7"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0ef44ef-2de2-44fa-b971-912af75fbb46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ef44ef-2de2-44fa-b971-912af75fbb46
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0ef44ef-2de2-44fa-b971-912af75fbb46
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-f3f19a39-3cb2-421f-a1cf-450075426946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f19a39-3cb2-421f-a1cf-450075426946
Content-Type: application/json

--- request body ---
{"handle":"qa-7547b1e53a68","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3f19a39-3cb2-421f-a1cf-450075426946
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3f19a39-3cb2-421f-a1cf-450075426946"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d9228ad-0192-46bc-aacb-0e0cfdf47e6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d9228ad-0192-46bc-aacb-0e0cfdf47e6d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d9228ad-0192-46bc-aacb-0e0cfdf47e6d
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-7b9107c8-66b3-487e-902a-143324004ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b9107c8-66b3-487e-902a-143324004ba8
Content-Type: application/json

--- request body ---
{"handle":"qa-e0a1cd6b822b","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b9107c8-66b3-487e-902a-143324004ba8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b9107c8-66b3-487e-902a-143324004ba8"}
```
