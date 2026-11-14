# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-6f9e793c-4e04-4a7d-bc21-6ef6b855546d` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-462b50d4-386b-472d-946f-b45ef2f39a3b` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-9fda276f-308a-4122-a218-091420e9a70f` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-bdaae42a-cba4-406c-92b3-af6ff6fb8f07` |
| 5 | `PATCH /v1/accounts/me` | 415 | 39 | `qa-51578b16-4cb9-4b68-9014-0b9f73883469` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-2dbd085e-3ec7-456c-ad57-fab748e0ee0b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-6b093517-d271-48ac-899f-8ad3a0927b34` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-b057ee53-866f-4332-9a90-3b97132554dc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d550b3e9-157e-4e4a-94bf-2b865e0e987e` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-0e14b311-15ba-4227-9772-a1790deb5d33` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f9e793c-4e04-4a7d-bc21-6ef6b855546d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f9e793c-4e04-4a7d-bc21-6ef6b855546d
Content-Type: application/json

--- request body ---
{"handle":"qa-88e910502cad","displayName":"QA 88e910502cad","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f9e793c-4e04-4a7d-bc21-6ef6b855546d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-88e910502cad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_240cd80c-059b-4b43-8104-e361f6e391d8","handle":"qa-88e910502cad","displayName":"QA 88e910502cad","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.082087579Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-462b50d4-386b-472d-946f-b45ef2f39a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462b50d4-386b-472d-946f-b45ef2f39a3b
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5aa3ccf25d","displayName":"QA dd5aa3ccf25d","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-462b50d4-386b-472d-946f-b45ef2f39a3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-dd5aa3ccf25d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8470946-6515-4057-a171-e050ecda9218","handle":"qa-dd5aa3ccf25d","displayName":"QA dd5aa3ccf25d","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.129646290Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9fda276f-308a-4122-a218-091420e9a70f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fda276f-308a-4122-a218-091420e9a70f
Content-Type: application/json

--- request body ---
{"handle":"qa-88e910502cad","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fda276f-308a-4122-a218-091420e9a70f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_240cd80c-059b-4b43-8104-e361f6e391d8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bdaae42a-cba4-406c-92b3-af6ff6fb8f07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdaae42a-cba4-406c-92b3-af6ff6fb8f07
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd5aa3ccf25d","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdaae42a-cba4-406c-92b3-af6ff6fb8f07
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
Location: /v1/conversations/cnv_a8016ab1-710e-431d-bc75-3468eca2d4a4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a8016ab1-710e-431d-bc75-3468eca2d4a4","subject":"Error contract","status":"open","region":"eu","participants":["qa-88e910502cad","qa-dd5aa3ccf25d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.208965230Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-51578b16-4cb9-4b68-9014-0b9f73883469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51578b16-4cb9-4b68-9014-0b9f73883469
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51578b16-4cb9-4b68-9014-0b9f73883469
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-51578b16-4cb9-4b68-9014-0b9f73883469"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2dbd085e-3ec7-456c-ad57-fab748e0ee0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dbd085e-3ec7-456c-ad57-fab748e0ee0b
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5aa3ccf25d","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dbd085e-3ec7-456c-ad57-fab748e0ee0b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8470946-6515-4057-a171-e050ecda9218"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b093517-d271-48ac-899f-8ad3a0927b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b093517-d271-48ac-899f-8ad3a0927b34
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b093517-d271-48ac-899f-8ad3a0927b34
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
correlation: qa-b057ee53-866f-4332-9a90-3b97132554dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b057ee53-866f-4332-9a90-3b97132554dc
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5aa3ccf25d","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b057ee53-866f-4332-9a90-3b97132554dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b057ee53-866f-4332-9a90-3b97132554dc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d550b3e9-157e-4e4a-94bf-2b865e0e987e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d550b3e9-157e-4e4a-94bf-2b865e0e987e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d550b3e9-157e-4e4a-94bf-2b865e0e987e
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
correlation: qa-0e14b311-15ba-4227-9772-a1790deb5d33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e14b311-15ba-4227-9772-a1790deb5d33
Content-Type: application/json

--- request body ---
{"handle":"qa-88e910502cad","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e14b311-15ba-4227-9772-a1790deb5d33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e14b311-15ba-4227-9772-a1790deb5d33"}
```
