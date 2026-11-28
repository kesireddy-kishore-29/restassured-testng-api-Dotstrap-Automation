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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-fb74709a-f1c7-4fd1-8233-687c0d382ad0` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-f184ac14-f7c1-493c-bb0d-9736f41dffe4` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-f9c2c3b0-e6c6-4481-9782-8725a62f24c3` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-fc916462-42f0-4507-b028-55f389af30ba` |
| 5 | `POST /v1/conversations` | 415 | 17 | `qa-f65fa33b-3c43-4977-9339-f9942e981dc2` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-480b17cd-d478-4a1c-a4a6-1e2fcfb38d5f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1158e347-49e1-4802-820b-e6906d5d1a6b` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-c8203739-6ead-4229-938f-73090cb61ad5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-bedb2a86-cd06-42f4-b1d1-120db139616b` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-12fad4f5-fd48-4c97-a6a1-cd4876d0bed5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fb74709a-f1c7-4fd1-8233-687c0d382ad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb74709a-f1c7-4fd1-8233-687c0d382ad0
Content-Type: application/json

--- request body ---
{"handle":"qa-b7cb23a5fb85","displayName":"QA b7cb23a5fb85","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb74709a-f1c7-4fd1-8233-687c0d382ad0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-b7cb23a5fb85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86f7a1fd-ff0b-4010-9a71-77f993a33782","handle":"qa-b7cb23a5fb85","displayName":"QA b7cb23a5fb85","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.261340944Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f184ac14-f7c1-493c-bb0d-9736f41dffe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f184ac14-f7c1-493c-bb0d-9736f41dffe4
Content-Type: application/json

--- request body ---
{"handle":"qa-c53cf0a02f1a","displayName":"QA c53cf0a02f1a","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f184ac14-f7c1-493c-bb0d-9736f41dffe4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-c53cf0a02f1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c779224-110f-4805-b59d-dbd5b75dc4c1","handle":"qa-c53cf0a02f1a","displayName":"QA c53cf0a02f1a","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.313923802Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f9c2c3b0-e6c6-4481-9782-8725a62f24c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9c2c3b0-e6c6-4481-9782-8725a62f24c3
Content-Type: application/json

--- request body ---
{"handle":"qa-b7cb23a5fb85","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9c2c3b0-e6c6-4481-9782-8725a62f24c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86f7a1fd-ff0b-4010-9a71-77f993a33782"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fc916462-42f0-4507-b028-55f389af30ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc916462-42f0-4507-b028-55f389af30ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c53cf0a02f1a","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc916462-42f0-4507-b028-55f389af30ba
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
Location: /v1/conversations/cnv_0b814cdd-cf6e-40af-bc78-255e51cb95ad
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0b814cdd-cf6e-40af-bc78-255e51cb95ad","subject":"Error contract","status":"open","region":"eu","participants":["qa-b7cb23a5fb85","qa-c53cf0a02f1a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.382382334Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f65fa33b-3c43-4977-9339-f9942e981dc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f65fa33b-3c43-4977-9339-f9942e981dc2
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f65fa33b-3c43-4977-9339-f9942e981dc2
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-f65fa33b-3c43-4977-9339-f9942e981dc2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-480b17cd-d478-4a1c-a4a6-1e2fcfb38d5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-480b17cd-d478-4a1c-a4a6-1e2fcfb38d5f
Content-Type: application/json

--- request body ---
{"handle":"qa-c53cf0a02f1a","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-480b17cd-d478-4a1c-a4a6-1e2fcfb38d5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c779224-110f-4805-b59d-dbd5b75dc4c1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1158e347-49e1-4802-820b-e6906d5d1a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1158e347-49e1-4802-820b-e6906d5d1a6b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1158e347-49e1-4802-820b-e6906d5d1a6b
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
correlation: qa-c8203739-6ead-4229-938f-73090cb61ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8203739-6ead-4229-938f-73090cb61ad5
Content-Type: application/json

--- request body ---
{"handle":"qa-c53cf0a02f1a","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8203739-6ead-4229-938f-73090cb61ad5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8203739-6ead-4229-938f-73090cb61ad5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bedb2a86-cd06-42f4-b1d1-120db139616b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bedb2a86-cd06-42f4-b1d1-120db139616b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bedb2a86-cd06-42f4-b1d1-120db139616b
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
correlation: qa-12fad4f5-fd48-4c97-a6a1-cd4876d0bed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12fad4f5-fd48-4c97-a6a1-cd4876d0bed5
Content-Type: application/json

--- request body ---
{"handle":"qa-b7cb23a5fb85","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12fad4f5-fd48-4c97-a6a1-cd4876d0bed5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12fad4f5-fd48-4c97-a6a1-cd4876d0bed5"}
```
