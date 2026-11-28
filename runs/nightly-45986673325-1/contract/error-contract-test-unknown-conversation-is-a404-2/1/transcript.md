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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-13691da3-9556-45a4-b3f4-d89aee1528b7` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-58be2f9e-3583-4170-8247-8f0c88507fe2` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 12 | `qa-6596cce7-000d-4222-8ab3-ef40e1c8ef26` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-63d68307-852d-4402-bd7c-aef9da648387` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-f40c0f48-ccf4-4f06-9355-a42a7d8785ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-13691da3-9556-45a4-b3f4-d89aee1528b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13691da3-9556-45a4-b3f4-d89aee1528b7
Content-Type: application/json

--- request body ---
{"handle":"qa-853855b8c9e3","displayName":"QA 853855b8c9e3","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-13691da3-9556-45a4-b3f4-d89aee1528b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-853855b8c9e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76dbd55a-46f6-445d-a20d-c8ec31867ef0","handle":"qa-853855b8c9e3","displayName":"QA 853855b8c9e3","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.576923785Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-58be2f9e-3583-4170-8247-8f0c88507fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58be2f9e-3583-4170-8247-8f0c88507fe2
Content-Type: application/json

--- request body ---
{"handle":"qa-853855b8c9e3","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-58be2f9e-3583-4170-8247-8f0c88507fe2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76dbd55a-46f6-445d-a20d-c8ec31867ef0"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-6596cce7-000d-4222-8ab3-ef40e1c8ef26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6596cce7-000d-4222-8ab3-ef40e1c8ef26
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6596cce7-000d-4222-8ab3-ef40e1c8ef26
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-6596cce7-000d-4222-8ab3-ef40e1c8ef26"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63d68307-852d-4402-bd7c-aef9da648387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63d68307-852d-4402-bd7c-aef9da648387
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63d68307-852d-4402-bd7c-aef9da648387
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
correlation: qa-f40c0f48-ccf4-4f06-9355-a42a7d8785ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f40c0f48-ccf4-4f06-9355-a42a7d8785ae
Content-Type: application/json

--- request body ---
{"handle":"qa-853855b8c9e3","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f40c0f48-ccf4-4f06-9355-a42a7d8785ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f40c0f48-ccf4-4f06-9355-a42a7d8785ae"}
```
