# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-e7480121-366c-4a2e-b134-e6b8677e7ade` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-fd95d85a-d19f-480e-b6e7-1b28abf7dab8` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-3a9bf1a8-2353-49b1-a32a-5b666d533bfc` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-ff759f48-f8c2-4101-8540-0c5358b3a16a` |
| 5 | `POST /v1/conversations` | 422 | 19 | `qa-9b637e23-a1e4-47de-aeb2-4b66d2c0e79d` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-b4383c39-cae2-43d8-a159-6c097c1a20ca` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-b3a5264b-42de-480f-855d-a39737e454d7` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-9336d0d9-5376-47c9-9552-6590c10e794d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0c28154a-82d0-40c1-bf00-bf2b2bfb84e8` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-059cad54-580c-4135-a51b-f897956d7644` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e7480121-366c-4a2e-b134-e6b8677e7ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7480121-366c-4a2e-b134-e6b8677e7ade
Content-Type: application/json

--- request body ---
{"handle":"qa-2b696d267be2","displayName":"QA 2b696d267be2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7480121-366c-4a2e-b134-e6b8677e7ade
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-2b696d267be2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50058cab-9656-40e9-85bb-67f294b44624","handle":"qa-2b696d267be2","displayName":"QA 2b696d267be2","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.290739513Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fd95d85a-d19f-480e-b6e7-1b28abf7dab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd95d85a-d19f-480e-b6e7-1b28abf7dab8
Content-Type: application/json

--- request body ---
{"handle":"qa-7ef556aa4f5a","displayName":"QA 7ef556aa4f5a","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd95d85a-d19f-480e-b6e7-1b28abf7dab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-7ef556aa4f5a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f55466f-6910-4b2e-8a06-c52c05e0723f","handle":"qa-7ef556aa4f5a","displayName":"QA 7ef556aa4f5a","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.335852803Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a9bf1a8-2353-49b1-a32a-5b666d533bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a9bf1a8-2353-49b1-a32a-5b666d533bfc
Content-Type: application/json

--- request body ---
{"handle":"qa-2b696d267be2","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a9bf1a8-2353-49b1-a32a-5b666d533bfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50058cab-9656-40e9-85bb-67f294b44624"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff759f48-f8c2-4101-8540-0c5358b3a16a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff759f48-f8c2-4101-8540-0c5358b3a16a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7ef556aa4f5a","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff759f48-f8c2-4101-8540-0c5358b3a16a
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
Location: /v1/conversations/cnv_f8c0b13f-1708-4380-a2bc-33060e6f6d68
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f8c0b13f-1708-4380-a2bc-33060e6f6d68","subject":"Error contract","status":"open","region":"eu","participants":["qa-2b696d267be2","qa-7ef556aa4f5a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.408262055Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9b637e23-a1e4-47de-aeb2-4b66d2c0e79d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b637e23-a1e4-47de-aeb2-4b66d2c0e79d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7ef556aa4f5a","subject":" ","message":"Hi"}

--- response: 422 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b637e23-a1e4-47de-aeb2-4b66d2c0e79d
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-9b637e23-a1e4-47de-aeb2-4b66d2c0e79d","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b4383c39-cae2-43d8-a159-6c097c1a20ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4383c39-cae2-43d8-a159-6c097c1a20ca
Content-Type: application/json

--- request body ---
{"handle":"qa-7ef556aa4f5a","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4383c39-cae2-43d8-a159-6c097c1a20ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f55466f-6910-4b2e-8a06-c52c05e0723f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3a5264b-42de-480f-855d-a39737e454d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3a5264b-42de-480f-855d-a39737e454d7
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3a5264b-42de-480f-855d-a39737e454d7
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
correlation: qa-9336d0d9-5376-47c9-9552-6590c10e794d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9336d0d9-5376-47c9-9552-6590c10e794d
Content-Type: application/json

--- request body ---
{"handle":"qa-7ef556aa4f5a","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9336d0d9-5376-47c9-9552-6590c10e794d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9336d0d9-5376-47c9-9552-6590c10e794d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c28154a-82d0-40c1-bf00-bf2b2bfb84e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c28154a-82d0-40c1-bf00-bf2b2bfb84e8
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c28154a-82d0-40c1-bf00-bf2b2bfb84e8
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
correlation: qa-059cad54-580c-4135-a51b-f897956d7644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-059cad54-580c-4135-a51b-f897956d7644
Content-Type: application/json

--- request body ---
{"handle":"qa-2b696d267be2","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-059cad54-580c-4135-a51b-f897956d7644
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-059cad54-580c-4135-a51b-f897956d7644"}
```
