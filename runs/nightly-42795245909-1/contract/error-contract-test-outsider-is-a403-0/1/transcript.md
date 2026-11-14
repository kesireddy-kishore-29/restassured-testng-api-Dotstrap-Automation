# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-e214994a-b818-4743-8c20-f0ed606ed309` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-cfeec0c8-a419-4747-b2dc-5560b5d066b4` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-fe4c2eb5-480b-480d-9c43-c836842519e7` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-f9a67651-303f-43fb-8363-bfa3e486cc18` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-1fdf01ad-b4d4-45da-9372-faba137fb753` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-2ec868cf-eb79-432a-a342-838e2189a403` |
| 7 | `GET /v1/conversations/{id}` | 403 | 27 | `qa-422e879b-1c4a-435d-b0ea-ec3ae699800b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-f375edc8-213c-44d4-adef-c33f9d43380f` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-64ccde00-4158-4612-aef3-515c15617c6c` |
| 10 | `POST /v1/auth/token` | 200 | 67 | `qa-9f5c6662-6fa2-44a1-aec7-5adc6e7d0db3` |
| 11 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-b15fd0be-8034-4575-b9dd-9287203b4b0a` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-e1ff528a-eab1-4c69-8cdd-437bb6048afd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-3c06fedb-c853-401d-89b7-b01ebeb94ca6` |
| 14 | `POST /v1/auth/token` | 401 | 28 | `qa-b5e1d35e-e303-4eb9-a52d-e8d90325e4eb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e214994a-b818-4743-8c20-f0ed606ed309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e214994a-b818-4743-8c20-f0ed606ed309
Content-Type: application/json

--- request body ---
{"handle":"qa-7a074f38a804","displayName":"QA 7a074f38a804","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e214994a-b818-4743-8c20-f0ed606ed309
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-7a074f38a804
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1b40ad0-0c8b-48ad-9807-c901f12102a3","handle":"qa-7a074f38a804","displayName":"QA 7a074f38a804","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.278531459Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cfeec0c8-a419-4747-b2dc-5560b5d066b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfeec0c8-a419-4747-b2dc-5560b5d066b4
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7501214e25","displayName":"QA cf7501214e25","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfeec0c8-a419-4747-b2dc-5560b5d066b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-cf7501214e25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59f13e6d-99bb-4f49-a299-ba095145e779","handle":"qa-cf7501214e25","displayName":"QA cf7501214e25","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.318310995Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-fe4c2eb5-480b-480d-9c43-c836842519e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe4c2eb5-480b-480d-9c43-c836842519e7
Content-Type: application/json

--- request body ---
{"handle":"qa-f6a2e8ed4a1d","displayName":"QA f6a2e8ed4a1d","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe4c2eb5-480b-480d-9c43-c836842519e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-f6a2e8ed4a1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22acd579-5b39-4d82-a92e-8f34002f0113","handle":"qa-f6a2e8ed4a1d","displayName":"QA f6a2e8ed4a1d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.350161051Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f9a67651-303f-43fb-8363-bfa3e486cc18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a67651-303f-43fb-8363-bfa3e486cc18
Content-Type: application/json

--- request body ---
{"handle":"qa-7a074f38a804","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9a67651-303f-43fb-8363-bfa3e486cc18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1b40ad0-0c8b-48ad-9807-c901f12102a3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1fdf01ad-b4d4-45da-9372-faba137fb753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fdf01ad-b4d4-45da-9372-faba137fb753
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf7501214e25","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fdf01ad-b4d4-45da-9372-faba137fb753
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
Location: /v1/conversations/cnv_45f721d9-afdd-403e-8bf3-16e169721cf2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_45f721d9-afdd-403e-8bf3-16e169721cf2","subject":"Error contract","status":"open","region":"eu","participants":["qa-7a074f38a804","qa-cf7501214e25"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.406810028Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2ec868cf-eb79-432a-a342-838e2189a403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ec868cf-eb79-432a-a342-838e2189a403
Content-Type: application/json

--- request body ---
{"handle":"qa-f6a2e8ed4a1d","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ec868cf-eb79-432a-a342-838e2189a403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22acd579-5b39-4d82-a92e-8f34002f0113"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_45f721d9-afdd-403e-8bf3-16e169721cf2
correlation: qa-422e879b-1c4a-435d-b0ea-ec3ae699800b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-422e879b-1c4a-435d-b0ea-ec3ae699800b
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-422e879b-1c4a-435d-b0ea-ec3ae699800b
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_45f721d9-afdd-403e-8bf3-16e169721cf2","correlationId":"qa-422e879b-1c4a-435d-b0ea-ec3ae699800b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f375edc8-213c-44d4-adef-c33f9d43380f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f375edc8-213c-44d4-adef-c33f9d43380f
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f375edc8-213c-44d4-adef-c33f9d43380f
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
correlation: qa-64ccde00-4158-4612-aef3-515c15617c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64ccde00-4158-4612-aef3-515c15617c6c
Content-Type: application/json

--- request body ---
{"handle":"qa-f6a2e8ed4a1d","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64ccde00-4158-4612-aef3-515c15617c6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64ccde00-4158-4612-aef3-515c15617c6c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9f5c6662-6fa2-44a1-aec7-5adc6e7d0db3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5c6662-6fa2-44a1-aec7-5adc6e7d0db3
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7501214e25","password":"****"}

--- response: 200 in 67 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f5c6662-6fa2-44a1-aec7-5adc6e7d0db3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59f13e6d-99bb-4f49-a299-ba095145e779"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b15fd0be-8034-4575-b9dd-9287203b4b0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15fd0be-8034-4575-b9dd-9287203b4b0a
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b15fd0be-8034-4575-b9dd-9287203b4b0a
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
correlation: qa-e1ff528a-eab1-4c69-8cdd-437bb6048afd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1ff528a-eab1-4c69-8cdd-437bb6048afd
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7501214e25","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1ff528a-eab1-4c69-8cdd-437bb6048afd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1ff528a-eab1-4c69-8cdd-437bb6048afd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c06fedb-c853-401d-89b7-b01ebeb94ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c06fedb-c853-401d-89b7-b01ebeb94ca6
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c06fedb-c853-401d-89b7-b01ebeb94ca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b5e1d35e-e303-4eb9-a52d-e8d90325e4eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5e1d35e-e303-4eb9-a52d-e8d90325e4eb
Content-Type: application/json

--- request body ---
{"handle":"qa-7a074f38a804","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5e1d35e-e303-4eb9-a52d-e8d90325e4eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5e1d35e-e303-4eb9-a52d-e8d90325e4eb"}
```
