# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-177f2f06-2c66-4b47-aa9f-7a261e72843a` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-258d6d99-6a7a-4faa-ae2b-be190f7b1347` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 19 | `qa-314e7226-fba2-4fbb-aaf8-350e0e3f86e7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-dd80ad4f-296b-4e51-a5f6-8b96101c7dc6` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-cdd7a378-16de-43f9-bb6e-a7f9325c644f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-177f2f06-2c66-4b47-aa9f-7a261e72843a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-177f2f06-2c66-4b47-aa9f-7a261e72843a
Content-Type: application/json

--- request body ---
{"handle":"qa-67d564cb2c49","displayName":"QA 67d564cb2c49","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-177f2f06-2c66-4b47-aa9f-7a261e72843a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Location: /v1/accounts/qa-67d564cb2c49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf5f5281-518b-4a07-acdf-563f63f91a0d","handle":"qa-67d564cb2c49","displayName":"QA 67d564cb2c49","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.821795754Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-258d6d99-6a7a-4faa-ae2b-be190f7b1347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-258d6d99-6a7a-4faa-ae2b-be190f7b1347
Content-Type: application/json

--- request body ---
{"handle":"qa-67d564cb2c49","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-258d6d99-6a7a-4faa-ae2b-be190f7b1347
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf5f5281-518b-4a07-acdf-563f63f91a0d"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-314e7226-fba2-4fbb-aaf8-350e0e3f86e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-314e7226-fba2-4fbb-aaf8-350e0e3f86e7
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-314e7226-fba2-4fbb-aaf8-350e0e3f86e7
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-314e7226-fba2-4fbb-aaf8-350e0e3f86e7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd80ad4f-296b-4e51-a5f6-8b96101c7dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd80ad4f-296b-4e51-a5f6-8b96101c7dc6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd80ad4f-296b-4e51-a5f6-8b96101c7dc6
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-cdd7a378-16de-43f9-bb6e-a7f9325c644f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdd7a378-16de-43f9-bb6e-a7f9325c644f
Content-Type: application/json

--- request body ---
{"handle":"qa-67d564cb2c49","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdd7a378-16de-43f9-bb6e-a7f9325c644f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cdd7a378-16de-43f9-bb6e-a7f9325c644f"}
```
