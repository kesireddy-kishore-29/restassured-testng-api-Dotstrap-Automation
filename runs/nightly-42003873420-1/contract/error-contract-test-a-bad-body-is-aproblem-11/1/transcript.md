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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-96a6ebaa-f626-4f22-baee-cfa96db43501` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-a979508a-12ab-4779-9ed7-22a9945e7599` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-be0da7e7-b74f-4f0f-a669-37c940e62b10` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-3e45507d-038c-4a9a-91ad-b0e9f42e7812` |
| 5 | `POST /v1/conversations` | 422 | 31 | `qa-df7f0679-9dc6-432c-83b9-278a45426899` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-672f7eee-3cf1-40b1-a4a2-aef0e910be39` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3c705260-f2bd-4242-8d5f-ff2d851c16d3` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-03b6a18b-9420-45b5-b979-1a9e36f90278` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-58ac736c-3afd-46a1-b001-1f601a6bcbb9` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-d2b10508-8607-4fdc-a2f1-f514e3a38cb4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-96a6ebaa-f626-4f22-baee-cfa96db43501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96a6ebaa-f626-4f22-baee-cfa96db43501
Content-Type: application/json

--- request body ---
{"handle":"qa-6774e06e8062","displayName":"QA 6774e06e8062","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-96a6ebaa-f626-4f22-baee-cfa96db43501
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
Location: /v1/accounts/qa-6774e06e8062
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e1fe203-20f1-4ffd-a799-c45b9860fd40","handle":"qa-6774e06e8062","displayName":"QA 6774e06e8062","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.139962050Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a979508a-12ab-4779-9ed7-22a9945e7599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a979508a-12ab-4779-9ed7-22a9945e7599
Content-Type: application/json

--- request body ---
{"handle":"qa-b8e92f758c48","displayName":"QA b8e92f758c48","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a979508a-12ab-4779-9ed7-22a9945e7599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-b8e92f758c48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c01849e6-62d2-4e49-8bba-5773264e45bb","handle":"qa-b8e92f758c48","displayName":"QA b8e92f758c48","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.181300174Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be0da7e7-b74f-4f0f-a669-37c940e62b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0da7e7-b74f-4f0f-a669-37c940e62b10
Content-Type: application/json

--- request body ---
{"handle":"qa-6774e06e8062","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-be0da7e7-b74f-4f0f-a669-37c940e62b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e1fe203-20f1-4ffd-a799-c45b9860fd40"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3e45507d-038c-4a9a-91ad-b0e9f42e7812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e45507d-038c-4a9a-91ad-b0e9f42e7812
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8e92f758c48","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e45507d-038c-4a9a-91ad-b0e9f42e7812
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
Location: /v1/conversations/cnv_644ecb5b-6d77-41bf-82a3-24b155179f35
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_644ecb5b-6d77-41bf-82a3-24b155179f35","subject":"Error contract","status":"open","region":"eu","participants":["qa-6774e06e8062","qa-b8e92f758c48"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.277058261Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-df7f0679-9dc6-432c-83b9-278a45426899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7f0679-9dc6-432c-83b9-278a45426899
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8e92f758c48","subject":" ","message":"Hi"}

--- response: 422 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df7f0679-9dc6-432c-83b9-278a45426899
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-df7f0679-9dc6-432c-83b9-278a45426899","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-672f7eee-3cf1-40b1-a4a2-aef0e910be39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672f7eee-3cf1-40b1-a4a2-aef0e910be39
Content-Type: application/json

--- request body ---
{"handle":"qa-b8e92f758c48","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-672f7eee-3cf1-40b1-a4a2-aef0e910be39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c01849e6-62d2-4e49-8bba-5773264e45bb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c705260-f2bd-4242-8d5f-ff2d851c16d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c705260-f2bd-4242-8d5f-ff2d851c16d3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c705260-f2bd-4242-8d5f-ff2d851c16d3
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
correlation: qa-03b6a18b-9420-45b5-b979-1a9e36f90278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03b6a18b-9420-45b5-b979-1a9e36f90278
Content-Type: application/json

--- request body ---
{"handle":"qa-b8e92f758c48","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03b6a18b-9420-45b5-b979-1a9e36f90278
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03b6a18b-9420-45b5-b979-1a9e36f90278"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58ac736c-3afd-46a1-b001-1f601a6bcbb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ac736c-3afd-46a1-b001-1f601a6bcbb9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58ac736c-3afd-46a1-b001-1f601a6bcbb9
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
correlation: qa-d2b10508-8607-4fdc-a2f1-f514e3a38cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2b10508-8607-4fdc-a2f1-f514e3a38cb4
Content-Type: application/json

--- request body ---
{"handle":"qa-6774e06e8062","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2b10508-8607-4fdc-a2f1-f514e3a38cb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2b10508-8607-4fdc-a2f1-f514e3a38cb4"}
```
