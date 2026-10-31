# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-4ae0bd18-a6a5-4c9a-b0d7-03758e780d51` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-d417d857-a41f-4a26-8df6-3ab09c65ff47` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-f99de45f-2c97-4c32-aeaa-056bf297a8f3` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-d945bcfb-61fd-4e17-bf8f-610ad0b15b49` |
| 5 | `POST /v1/conversations` | 415 | 8 | `qa-b7ff39ad-1684-46c8-a02f-510df3c7f5a5` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-d082e1db-3b32-49fa-af12-c651a6bd5329` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0ea1c654-73ce-4d09-ba03-77e1a920c551` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-0644339f-0ca0-4f36-b3df-180fee9ff3c1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-63af23bc-8b26-48c7-85da-653870f05394` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-87f07203-c9af-4c67-9a2d-ce19b5f04298` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ae0bd18-a6a5-4c9a-b0d7-03758e780d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae0bd18-a6a5-4c9a-b0d7-03758e780d51
Content-Type: application/json

--- request body ---
{"handle":"qa-b6eb808ea19f","displayName":"QA b6eb808ea19f","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ae0bd18-a6a5-4c9a-b0d7-03758e780d51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-b6eb808ea19f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8548190-e1ab-4402-a4e2-c6f52a2a3648","handle":"qa-b6eb808ea19f","displayName":"QA b6eb808ea19f","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.107687903Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d417d857-a41f-4a26-8df6-3ab09c65ff47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d417d857-a41f-4a26-8df6-3ab09c65ff47
Content-Type: application/json

--- request body ---
{"handle":"qa-817fc579011b","displayName":"QA 817fc579011b","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d417d857-a41f-4a26-8df6-3ab09c65ff47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-817fc579011b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9b840bf-0479-4455-bb23-7486ed7fc03a","handle":"qa-817fc579011b","displayName":"QA 817fc579011b","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.147087545Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f99de45f-2c97-4c32-aeaa-056bf297a8f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f99de45f-2c97-4c32-aeaa-056bf297a8f3
Content-Type: application/json

--- request body ---
{"handle":"qa-b6eb808ea19f","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f99de45f-2c97-4c32-aeaa-056bf297a8f3
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8548190-e1ab-4402-a4e2-c6f52a2a3648"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d945bcfb-61fd-4e17-bf8f-610ad0b15b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d945bcfb-61fd-4e17-bf8f-610ad0b15b49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-817fc579011b","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d945bcfb-61fd-4e17-bf8f-610ad0b15b49
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
Location: /v1/conversations/cnv_6b368d9c-0106-4804-8de5-b2787726b903
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b368d9c-0106-4804-8de5-b2787726b903","subject":"Error contract","status":"open","region":"eu","participants":["qa-b6eb808ea19f","qa-817fc579011b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.217349876Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b7ff39ad-1684-46c8-a02f-510df3c7f5a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7ff39ad-1684-46c8-a02f-510df3c7f5a5
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7ff39ad-1684-46c8-a02f-510df3c7f5a5
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-b7ff39ad-1684-46c8-a02f-510df3c7f5a5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d082e1db-3b32-49fa-af12-c651a6bd5329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d082e1db-3b32-49fa-af12-c651a6bd5329
Content-Type: application/json

--- request body ---
{"handle":"qa-817fc579011b","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d082e1db-3b32-49fa-af12-c651a6bd5329
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9b840bf-0479-4455-bb23-7486ed7fc03a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ea1c654-73ce-4d09-ba03-77e1a920c551

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ea1c654-73ce-4d09-ba03-77e1a920c551
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ea1c654-73ce-4d09-ba03-77e1a920c551
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
correlation: qa-0644339f-0ca0-4f36-b3df-180fee9ff3c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0644339f-0ca0-4f36-b3df-180fee9ff3c1
Content-Type: application/json

--- request body ---
{"handle":"qa-817fc579011b","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0644339f-0ca0-4f36-b3df-180fee9ff3c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0644339f-0ca0-4f36-b3df-180fee9ff3c1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63af23bc-8b26-48c7-85da-653870f05394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63af23bc-8b26-48c7-85da-653870f05394
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63af23bc-8b26-48c7-85da-653870f05394
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
correlation: qa-87f07203-c9af-4c67-9a2d-ce19b5f04298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87f07203-c9af-4c67-9a2d-ce19b5f04298
Content-Type: application/json

--- request body ---
{"handle":"qa-b6eb808ea19f","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87f07203-c9af-4c67-9a2d-ce19b5f04298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-87f07203-c9af-4c67-9a2d-ce19b5f04298"}
```
