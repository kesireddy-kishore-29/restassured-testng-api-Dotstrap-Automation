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
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-09ec6d53-6633-4f30-9d42-4fea10f7b547` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-f48d2460-7ed4-4fe8-9596-74edae9fd951` |
| 3 | `POST /v1/accounts` | 201 | 45 | `qa-736be01b-00e8-4213-8069-d4b7b09ce55e` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-5b06d996-57d8-4f76-bf35-822b53298c54` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-1b0cf6e2-38ee-424d-9e61-ebee750b0852` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-4055f0bb-c767-447c-b7ec-763e554b2923` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 25 | `qa-e2fd9957-57aa-4dad-bbc3-1953963926e5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-d5fb5901-fcac-456f-8f83-80d79ddfaf27` |
| 9 | `POST /v1/auth/token` | 401 | 18 | `qa-d178dacd-6fac-4bca-ab05-d8e4a0a85be5` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-bd00f4aa-fee2-4cf4-99a1-83f3a6987c6b` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-3b72611d-3b80-465f-badd-23f780ee2837` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-0aa963fe-5bf8-4778-b31a-eb888cb07b2f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b0b52fb3-b49e-4caa-b0af-2b4aaa080967` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-b08b5926-6be7-440b-8547-5eb81eaf5112` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-09ec6d53-6633-4f30-9d42-4fea10f7b547

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09ec6d53-6633-4f30-9d42-4fea10f7b547
Content-Type: application/json

--- request body ---
{"handle":"qa-1748be40dec3","displayName":"QA 1748be40dec3","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-09ec6d53-6633-4f30-9d42-4fea10f7b547
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
Location: /v1/accounts/qa-1748be40dec3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e4a7de2-0a1a-4efa-82a7-a3c9bbc9e046","handle":"qa-1748be40dec3","displayName":"QA 1748be40dec3","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.657723754Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f48d2460-7ed4-4fe8-9596-74edae9fd951

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f48d2460-7ed4-4fe8-9596-74edae9fd951
Content-Type: application/json

--- request body ---
{"handle":"qa-0e7914ba54b3","displayName":"QA 0e7914ba54b3","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f48d2460-7ed4-4fe8-9596-74edae9fd951
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Location: /v1/accounts/qa-0e7914ba54b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9747661a-12ca-4252-a010-1cf45e53e741","handle":"qa-0e7914ba54b3","displayName":"QA 0e7914ba54b3","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.745272859Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-736be01b-00e8-4213-8069-d4b7b09ce55e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-736be01b-00e8-4213-8069-d4b7b09ce55e
Content-Type: application/json

--- request body ---
{"handle":"qa-61e76b3799b3","displayName":"QA 61e76b3799b3","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-736be01b-00e8-4213-8069-d4b7b09ce55e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Location: /v1/accounts/qa-61e76b3799b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d270c64d-5e2a-4d2e-831e-682a29989f3f","handle":"qa-61e76b3799b3","displayName":"QA 61e76b3799b3","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.810752747Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5b06d996-57d8-4f76-bf35-822b53298c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b06d996-57d8-4f76-bf35-822b53298c54
Content-Type: application/json

--- request body ---
{"handle":"qa-1748be40dec3","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b06d996-57d8-4f76-bf35-822b53298c54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e4a7de2-0a1a-4efa-82a7-a3c9bbc9e046"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1b0cf6e2-38ee-424d-9e61-ebee750b0852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b0cf6e2-38ee-424d-9e61-ebee750b0852
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e7914ba54b3","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b0cf6e2-38ee-424d-9e61-ebee750b0852
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
Location: /v1/conversations/cnv_2d2eb11d-43c0-4728-b94f-d03ce09e80c1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2d2eb11d-43c0-4728-b94f-d03ce09e80c1","subject":"Error contract","status":"open","region":"eu","participants":["qa-1748be40dec3","qa-0e7914ba54b3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.905278271Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4055f0bb-c767-447c-b7ec-763e554b2923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4055f0bb-c767-447c-b7ec-763e554b2923
Content-Type: application/json

--- request body ---
{"handle":"qa-61e76b3799b3","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4055f0bb-c767-447c-b7ec-763e554b2923
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d270c64d-5e2a-4d2e-831e-682a29989f3f"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_2d2eb11d-43c0-4728-b94f-d03ce09e80c1/close
correlation: qa-e2fd9957-57aa-4dad-bbc3-1953963926e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2fd9957-57aa-4dad-bbc3-1953963926e5
Content-Type: application/json

--- response: 403 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2fd9957-57aa-4dad-bbc3-1953963926e5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2d2eb11d-43c0-4728-b94f-d03ce09e80c1/close","correlationId":"qa-e2fd9957-57aa-4dad-bbc3-1953963926e5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5fb5901-fcac-456f-8f83-80d79ddfaf27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5fb5901-fcac-456f-8f83-80d79ddfaf27
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5fb5901-fcac-456f-8f83-80d79ddfaf27
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
correlation: qa-d178dacd-6fac-4bca-ab05-d8e4a0a85be5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d178dacd-6fac-4bca-ab05-d8e4a0a85be5
Content-Type: application/json

--- request body ---
{"handle":"qa-61e76b3799b3","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d178dacd-6fac-4bca-ab05-d8e4a0a85be5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d178dacd-6fac-4bca-ab05-d8e4a0a85be5"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bd00f4aa-fee2-4cf4-99a1-83f3a6987c6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd00f4aa-fee2-4cf4-99a1-83f3a6987c6b
Content-Type: application/json

--- request body ---
{"handle":"qa-0e7914ba54b3","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd00f4aa-fee2-4cf4-99a1-83f3a6987c6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9747661a-12ca-4252-a010-1cf45e53e741"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b72611d-3b80-465f-badd-23f780ee2837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b72611d-3b80-465f-badd-23f780ee2837
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b72611d-3b80-465f-badd-23f780ee2837
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
correlation: qa-0aa963fe-5bf8-4778-b31a-eb888cb07b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa963fe-5bf8-4778-b31a-eb888cb07b2f
Content-Type: application/json

--- request body ---
{"handle":"qa-0e7914ba54b3","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aa963fe-5bf8-4778-b31a-eb888cb07b2f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0aa963fe-5bf8-4778-b31a-eb888cb07b2f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b0b52fb3-b49e-4caa-b0af-2b4aaa080967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0b52fb3-b49e-4caa-b0af-2b4aaa080967
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b0b52fb3-b49e-4caa-b0af-2b4aaa080967
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
correlation: qa-b08b5926-6be7-440b-8547-5eb81eaf5112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b08b5926-6be7-440b-8547-5eb81eaf5112
Content-Type: application/json

--- request body ---
{"handle":"qa-1748be40dec3","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b08b5926-6be7-440b-8547-5eb81eaf5112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b08b5926-6be7-440b-8547-5eb81eaf5112"}
```
