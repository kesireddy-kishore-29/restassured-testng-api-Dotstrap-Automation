# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-4584fb13-0d65-4074-922d-ddc44677452f` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-17260ff4-cc7f-4bb2-9692-595702e90ac8` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-7d54b9b4-8f3b-46db-af8d-6156fbffe009` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-bae96937-6c3e-47fc-9c2f-b1cdad7cf448` |
| 5 | `POST /v1/accounts` | 415 | 15 | `qa-e6bc97f7-40fa-4e2d-8f22-1f4aff451502` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-7c186bd6-cab1-49d1-907b-a81edd1f20dd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fa02d287-2ce5-4630-af96-4f528676b8ba` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-0eaea4b6-5ea7-4e4c-95bc-6574f0d432df` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-a1a40713-ee1f-47ec-b2d4-282cc148d208` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-852de44f-cfcd-4be4-bcc2-7bbd664b0b05` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4584fb13-0d65-4074-922d-ddc44677452f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4584fb13-0d65-4074-922d-ddc44677452f
Content-Type: application/json

--- request body ---
{"handle":"qa-848ad081ea2f","displayName":"QA 848ad081ea2f","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4584fb13-0d65-4074-922d-ddc44677452f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Location: /v1/accounts/qa-848ad081ea2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a26869a0-45e6-436e-8d60-dddac9cd486e","handle":"qa-848ad081ea2f","displayName":"QA 848ad081ea2f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.373361586Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17260ff4-cc7f-4bb2-9692-595702e90ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17260ff4-cc7f-4bb2-9692-595702e90ac8
Content-Type: application/json

--- request body ---
{"handle":"qa-e7494a47709f","displayName":"QA e7494a47709f","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-17260ff4-cc7f-4bb2-9692-595702e90ac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-e7494a47709f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d16a14cf-f856-4074-8b8b-697d2b215f13","handle":"qa-e7494a47709f","displayName":"QA e7494a47709f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.424252788Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7d54b9b4-8f3b-46db-af8d-6156fbffe009

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d54b9b4-8f3b-46db-af8d-6156fbffe009
Content-Type: application/json

--- request body ---
{"handle":"qa-848ad081ea2f","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d54b9b4-8f3b-46db-af8d-6156fbffe009
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a26869a0-45e6-436e-8d60-dddac9cd486e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bae96937-6c3e-47fc-9c2f-b1cdad7cf448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bae96937-6c3e-47fc-9c2f-b1cdad7cf448
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e7494a47709f","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bae96937-6c3e-47fc-9c2f-b1cdad7cf448
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
Location: /v1/conversations/cnv_bc208d80-09d4-4d9a-b12d-abbd1c100b4c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc208d80-09d4-4d9a-b12d-abbd1c100b4c","subject":"Error contract","status":"open","region":"eu","participants":["qa-848ad081ea2f","qa-e7494a47709f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.520747943Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e6bc97f7-40fa-4e2d-8f22-1f4aff451502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6bc97f7-40fa-4e2d-8f22-1f4aff451502
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6bc97f7-40fa-4e2d-8f22-1f4aff451502
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-e6bc97f7-40fa-4e2d-8f22-1f4aff451502"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7c186bd6-cab1-49d1-907b-a81edd1f20dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c186bd6-cab1-49d1-907b-a81edd1f20dd
Content-Type: application/json

--- request body ---
{"handle":"qa-e7494a47709f","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c186bd6-cab1-49d1-907b-a81edd1f20dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d16a14cf-f856-4074-8b8b-697d2b215f13"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa02d287-2ce5-4630-af96-4f528676b8ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa02d287-2ce5-4630-af96-4f528676b8ba
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa02d287-2ce5-4630-af96-4f528676b8ba
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
correlation: qa-0eaea4b6-5ea7-4e4c-95bc-6574f0d432df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eaea4b6-5ea7-4e4c-95bc-6574f0d432df
Content-Type: application/json

--- request body ---
{"handle":"qa-e7494a47709f","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0eaea4b6-5ea7-4e4c-95bc-6574f0d432df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0eaea4b6-5ea7-4e4c-95bc-6574f0d432df"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1a40713-ee1f-47ec-b2d4-282cc148d208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1a40713-ee1f-47ec-b2d4-282cc148d208
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1a40713-ee1f-47ec-b2d4-282cc148d208
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
correlation: qa-852de44f-cfcd-4be4-bcc2-7bbd664b0b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-852de44f-cfcd-4be4-bcc2-7bbd664b0b05
Content-Type: application/json

--- request body ---
{"handle":"qa-848ad081ea2f","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-852de44f-cfcd-4be4-bcc2-7bbd664b0b05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-852de44f-cfcd-4be4-bcc2-7bbd664b0b05"}
```
