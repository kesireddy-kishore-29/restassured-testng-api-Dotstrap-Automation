# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 448 | `qa-887d799c-4ec5-488a-99e3-4f46e218fbd8` |
| 2 | `POST /v1/auth/token` | 200 | 52 | `qa-cbe9a83a-4a17-4726-97d5-693bec8c3433` |
| 3 | `GET /v1/accounts/me` | 200 | 54 | `qa-274563ec-08bb-4cd9-a798-e0dc8f5090be` |
| 4 | `GET /v1/accounts/me` | 200 | 18 | `qa-018693d1-ab27-4879-aaa9-73ea5ee58a68` |
| 5 | `GET /v1/accounts/me` | 200 | 21 | `qa-70f2fe06-ba15-433b-b382-15739abecd93` |
| 6 | `GET /v1/accounts/me` | 200 | 12 | `qa-8f13a1ed-ee63-470f-9536-2156e1130f16` |
| 7 | `GET /v1/accounts/me` | 200 | 12 | `qa-0d13412f-e4ee-42f7-beac-5b25594c0eec` |
| 8 | `GET /v1/accounts/me` | 200 | 13 | `qa-5d94941b-b66f-40aa-a9db-7555af1d7a93` |
| 9 | `GET /v1/accounts/me` | 200 | 12 | `qa-a0ff9d96-1aea-4969-931e-fb7c403cb6ae` |
| 10 | `GET /v1/accounts/me` | 200 | 7 | `qa-68aeaaa9-ac78-4d95-a9b5-cbee59bc080f` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-9b2dee17-1fdb-4a14-ba95-d94dfce204a8` |
| 12 | `GET /v1/accounts/me` | 200 | 17 | `qa-449b7cd7-5ab6-4508-83c8-50e98d0037e8` |
| 13 | `GET /v1/accounts/me` | 200 | 18 | `qa-a905237c-af6d-4f11-9b2a-03e0f8525296` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-61d91a18-cb6d-42ce-8217-42b387cfbeab` |
| 15 | `GET /v1/accounts/me` | 200 | 17 | `qa-8f5e1bf0-cd49-43b1-8fcd-1f22e5acc60f` |
| 16 | `GET /v1/accounts/me` | 200 | 13 | `qa-1ee6a85f-0757-4700-8f83-5ff6287f4ac8` |
| 17 | `GET /v1/accounts/me` | 200 | 17 | `qa-ced0fa9e-8b59-492a-8ca2-a178ba9b4d05` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-100eb633-20ff-467d-a063-84a056f48965` |
| 19 | `GET /v1/accounts/me` | 200 | 8 | `qa-0e2a37ac-5706-45b8-9fc8-612eafca88ce` |
| 20 | `GET /v1/accounts/me` | 200 | 13 | `qa-0425b4df-ff86-4e36-ad71-261be3b813ea` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-6ee188fd-430f-4f09-bb5e-f7513eca83fd` |
| 22 | `GET /v1/accounts/me` | 200 | 10 | `qa-e82c914c-6ffd-44f6-8609-52435b5c9366` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-040780a5-90eb-45f6-8a1a-182d9397e2b0` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-8d0c9a9d-ce9f-4db0-a533-8976018f2569` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-9daa5837-6f4e-4a3d-a76f-0e93cdb1fc86` |
| 26 | `GET /v1/accounts/me` | 200 | 9 | `qa-4d16d1ea-3a9e-45ec-b4d6-835413ecd99b` |
| 27 | `GET /v1/accounts/me` | 200 | 7 | `qa-86f0a001-f69b-47dc-8144-2ef834d3204d` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-56163c34-1aba-4282-986b-b60bbb3e7dc3` |
| 29 | `GET /v1/accounts/me` | 200 | 16 | `qa-43e38cf5-c12f-4e20-949b-48753ea97779` |
| 30 | `GET /v1/accounts/me` | 200 | 12 | `qa-b1b4be70-9c04-46f6-b091-dbc7eefab0cf` |
| 31 | `GET /v1/accounts/me` | 200 | 17 | `qa-35f7f0bd-dbee-4d5f-bc95-34b012fb85b1` |
| 32 | `GET /v1/accounts/me` | 200 | 11 | `qa-d027dd0a-ffea-4f97-8771-0e049e061275` |
| 33 | `GET /v1/accounts/me` | 200 | 23 | `qa-5d43bc95-5ebe-4d57-85d6-74c9a3acefd3` |
| 34 | `GET /v1/accounts/me` | 200 | 11 | `qa-7092020e-312d-4716-a034-d3af546b96f2` |
| 35 | `GET /v1/accounts/me` | 200 | 12 | `qa-834085e4-e60d-4588-adc8-fc2b1f9ea4cc` |
| 36 | `GET /v1/accounts/me` | 200 | 7 | `qa-7b5b2b38-3848-4124-afcf-3f31e5737a47` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-07bae7b7-04c9-4846-91cb-ddfd53090591` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-eaa6642b-d82c-4f88-9d7f-fbd8eb9b155c` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-d2dc8796-8678-4792-8faa-bf616361d8c9` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-556db6c5-2c53-46da-ac24-523fa4fae7cd` |
| 41 | `GET /v1/accounts/me` | 200 | 12 | `qa-cbaac2a1-9b1f-4b1e-9049-b446cd488125` |
| 42 | `GET /v1/accounts/me` | 200 | 15 | `qa-15268d38-f23c-4266-a34c-817958885792` |
| 43 | `GET /v1/accounts/me` | 200 | 13 | `qa-e3b701a0-576f-456c-8479-783c2260fb3f` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-8b5aa05e-06a6-4dce-9030-90a340f53438` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-ae2f3f5d-bf6e-4259-bb59-f5152a6cd4ad` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-c86cae2b-810c-4d1c-9f6c-6053742c9f68` |
| 47 | `GET /v1/accounts/me` | 200 | 12 | `qa-74cf3b09-1a68-49d0-b3d7-a0ecad3a36f6` |
| 48 | `GET /v1/accounts/me` | 200 | 20 | `qa-cc5738a1-d9d6-42fa-b8a2-a430a5a3e189` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-851cf5b8-6da0-4cf8-ad7b-7e0a79d4518f` |
| 50 | `GET /v1/accounts/me` | 200 | 10 | `qa-521816bb-8305-4995-b02c-e154263598cd` |
| 51 | `GET /v1/accounts/me` | 200 | 10 | `qa-6651832f-632c-483e-823c-5c839a128d9b` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-a45fe389-ee60-4a92-94e6-2b715742f0b8` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-76649598-0342-4e7f-8642-d0a5975512e7` |
| 54 | `GET /v1/accounts/me` | 200 | 9 | `qa-5f8c10e2-5a61-49f0-9aa8-a6b593f17436` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-d2db12d7-2175-45de-9055-53d19ffc5758` |
| 56 | `GET /v1/accounts/me` | 200 | 8 | `qa-282d8e02-5bbb-46a5-9875-32943f953cd4` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-a6db81cf-45d5-4dd0-9ba0-3a4079cf5859` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-26ac914d-fb7d-441a-b48f-8e0216618423` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-3729ae6e-3517-4210-8513-7251ae023849` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-c39dd066-2266-4c72-951a-61b33f3ff870` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-4d71bf3f-ac21-40d8-bc56-de87c61e5d38` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-22541d7a-ce37-4740-af8a-6c22495426c5` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-3e91c2b9-70e5-49c7-b48c-c6611b52fd74` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-719c1fe4-3787-4471-80bc-1c2153091eaa` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-a0c0551b-4853-423b-9011-915eb278b26c` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-e837949b-d3c3-4287-bd0a-d154645dc4fe` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-c96d6494-43af-4b5f-ab27-2f861e76976d` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-c7b9b8cb-d53b-4423-8da5-f21700fc3a6f` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-f87bfdd2-83dc-4c99-9ccf-a4bf3c542810` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-7cb0f22c-d997-44cb-a26b-abb1207c40da` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-60ea2e81-f056-4300-ab96-00868f816157` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-dfdb5ce4-22b4-41bf-9e10-3c55a1e822b5` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-9cd43047-37df-420c-8b90-f9c0930c653f` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-af2f4cc5-4695-4438-b36a-b116bd144f00` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-64572066-a570-4603-82ea-99140f14ff69` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-c5116d72-19c4-4819-9028-424fc2de1da2` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-8744bf41-35f7-49e2-826d-e0c5aa9ea8aa` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-b55620db-4641-457e-8b6b-c4b0e2a37d34` |
| 79 | `GET /v1/accounts/me` | 429 | 5 | `qa-e4550498-a44e-4eb6-90c3-92eb7b48a4ce` |
| 80 | `GET /v1/accounts/me` | 200 | 6 | `qa-ec064ae6-a7ab-4161-8f95-9dd799fe75d2` |
| 81 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-5d6287e5-f327-4e4c-a730-e412164011b5` |
| 82 | `POST /v1/auth/token` | 401 | 4 | `qa-ebd3176b-c384-4321-bbb2-65ae51f7976e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-887d799c-4ec5-488a-99e3-4f46e218fbd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-887d799c-4ec5-488a-99e3-4f46e218fbd8
Content-Type: application/json

--- request body ---
{"handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","password":"****","region":"eu"}

--- response: 201 in 448 ms ---
Date: Wed, 11 Nov 2026 09:34:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-887d799c-4ec5-488a-99e3-4f46e218fbd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-432cb5f3aded
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cbe9a83a-4a17-4726-97d5-693bec8c3433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe9a83a-4a17-4726-97d5-693bec8c3433
Content-Type: application/json

--- request body ---
{"handle":"qa-432cb5f3aded","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbe9a83a-4a17-4726-97d5-693bec8c3433
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-274563ec-08bb-4cd9-a798-e0dc8f5090be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-274563ec-08bb-4cd9-a798-e0dc8f5090be
Content-Type: application/json

--- response: 200 in 54 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-274563ec-08bb-4cd9-a798-e0dc8f5090be
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
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-018693d1-ab27-4879-aaa9-73ea5ee58a68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018693d1-ab27-4879-aaa9-73ea5ee58a68
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-018693d1-ab27-4879-aaa9-73ea5ee58a68
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
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-70f2fe06-ba15-433b-b382-15739abecd93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f2fe06-ba15-433b-b382-15739abecd93
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f2fe06-ba15-433b-b382-15739abecd93
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
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f13a1ed-ee63-470f-9536-2156e1130f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f13a1ed-ee63-470f-9536-2156e1130f16
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f13a1ed-ee63-470f-9536-2156e1130f16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d13412f-e4ee-42f7-beac-5b25594c0eec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d13412f-e4ee-42f7-beac-5b25594c0eec
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d13412f-e4ee-42f7-beac-5b25594c0eec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d94941b-b66f-40aa-a9db-7555af1d7a93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d94941b-b66f-40aa-a9db-7555af1d7a93
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d94941b-b66f-40aa-a9db-7555af1d7a93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0ff9d96-1aea-4969-931e-fb7c403cb6ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0ff9d96-1aea-4969-931e-fb7c403cb6ae
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0ff9d96-1aea-4969-931e-fb7c403cb6ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-68aeaaa9-ac78-4d95-a9b5-cbee59bc080f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68aeaaa9-ac78-4d95-a9b5-cbee59bc080f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-68aeaaa9-ac78-4d95-a9b5-cbee59bc080f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b2dee17-1fdb-4a14-ba95-d94dfce204a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b2dee17-1fdb-4a14-ba95-d94dfce204a8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b2dee17-1fdb-4a14-ba95-d94dfce204a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-449b7cd7-5ab6-4508-83c8-50e98d0037e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-449b7cd7-5ab6-4508-83c8-50e98d0037e8
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-449b7cd7-5ab6-4508-83c8-50e98d0037e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-a905237c-af6d-4f11-9b2a-03e0f8525296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a905237c-af6d-4f11-9b2a-03e0f8525296
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a905237c-af6d-4f11-9b2a-03e0f8525296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-61d91a18-cb6d-42ce-8217-42b387cfbeab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d91a18-cb6d-42ce-8217-42b387cfbeab
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-61d91a18-cb6d-42ce-8217-42b387cfbeab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f5e1bf0-cd49-43b1-8fcd-1f22e5acc60f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f5e1bf0-cd49-43b1-8fcd-1f22e5acc60f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f5e1bf0-cd49-43b1-8fcd-1f22e5acc60f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ee6a85f-0757-4700-8f83-5ff6287f4ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ee6a85f-0757-4700-8f83-5ff6287f4ac8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ee6a85f-0757-4700-8f83-5ff6287f4ac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-ced0fa9e-8b59-492a-8ca2-a178ba9b4d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ced0fa9e-8b59-492a-8ca2-a178ba9b4d05
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ced0fa9e-8b59-492a-8ca2-a178ba9b4d05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-100eb633-20ff-467d-a063-84a056f48965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-100eb633-20ff-467d-a063-84a056f48965
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-100eb633-20ff-467d-a063-84a056f48965
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e2a37ac-5706-45b8-9fc8-612eafca88ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e2a37ac-5706-45b8-9fc8-612eafca88ce
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e2a37ac-5706-45b8-9fc8-612eafca88ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-0425b4df-ff86-4e36-ad71-261be3b813ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0425b4df-ff86-4e36-ad71-261be3b813ea
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0425b4df-ff86-4e36-ad71-261be3b813ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ee188fd-430f-4f09-bb5e-f7513eca83fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee188fd-430f-4f09-bb5e-f7513eca83fd
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ee188fd-430f-4f09-bb5e-f7513eca83fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-e82c914c-6ffd-44f6-8609-52435b5c9366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e82c914c-6ffd-44f6-8609-52435b5c9366
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e82c914c-6ffd-44f6-8609-52435b5c9366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-040780a5-90eb-45f6-8a1a-182d9397e2b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040780a5-90eb-45f6-8a1a-182d9397e2b0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-040780a5-90eb-45f6-8a1a-182d9397e2b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d0c9a9d-ce9f-4db0-a533-8976018f2569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d0c9a9d-ce9f-4db0-a533-8976018f2569
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d0c9a9d-ce9f-4db0-a533-8976018f2569
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-9daa5837-6f4e-4a3d-a76f-0e93cdb1fc86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9daa5837-6f4e-4a3d-a76f-0e93cdb1fc86
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9daa5837-6f4e-4a3d-a76f-0e93cdb1fc86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d16d1ea-3a9e-45ec-b4d6-835413ecd99b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d16d1ea-3a9e-45ec-b4d6-835413ecd99b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d16d1ea-3a9e-45ec-b4d6-835413ecd99b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-86f0a001-f69b-47dc-8144-2ef834d3204d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f0a001-f69b-47dc-8144-2ef834d3204d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f0a001-f69b-47dc-8144-2ef834d3204d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-56163c34-1aba-4282-986b-b60bbb3e7dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56163c34-1aba-4282-986b-b60bbb3e7dc3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-56163c34-1aba-4282-986b-b60bbb3e7dc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-43e38cf5-c12f-4e20-949b-48753ea97779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e38cf5-c12f-4e20-949b-48753ea97779
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-43e38cf5-c12f-4e20-949b-48753ea97779
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1b4be70-9c04-46f6-b091-dbc7eefab0cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1b4be70-9c04-46f6-b091-dbc7eefab0cf
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1b4be70-9c04-46f6-b091-dbc7eefab0cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-35f7f0bd-dbee-4d5f-bc95-34b012fb85b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f7f0bd-dbee-4d5f-bc95-34b012fb85b1
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-35f7f0bd-dbee-4d5f-bc95-34b012fb85b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-d027dd0a-ffea-4f97-8771-0e049e061275

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d027dd0a-ffea-4f97-8771-0e049e061275
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d027dd0a-ffea-4f97-8771-0e049e061275
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d43bc95-5ebe-4d57-85d6-74c9a3acefd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d43bc95-5ebe-4d57-85d6-74c9a3acefd3
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d43bc95-5ebe-4d57-85d6-74c9a3acefd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-7092020e-312d-4716-a034-d3af546b96f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7092020e-312d-4716-a034-d3af546b96f2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7092020e-312d-4716-a034-d3af546b96f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-834085e4-e60d-4588-adc8-fc2b1f9ea4cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-834085e4-e60d-4588-adc8-fc2b1f9ea4cc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-834085e4-e60d-4588-adc8-fc2b1f9ea4cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b5b2b38-3848-4124-afcf-3f31e5737a47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b5b2b38-3848-4124-afcf-3f31e5737a47
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b5b2b38-3848-4124-afcf-3f31e5737a47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-07bae7b7-04c9-4846-91cb-ddfd53090591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07bae7b7-04c9-4846-91cb-ddfd53090591
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-07bae7b7-04c9-4846-91cb-ddfd53090591
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-eaa6642b-d82c-4f88-9d7f-fbd8eb9b155c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa6642b-d82c-4f88-9d7f-fbd8eb9b155c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaa6642b-d82c-4f88-9d7f-fbd8eb9b155c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2dc8796-8678-4792-8faa-bf616361d8c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2dc8796-8678-4792-8faa-bf616361d8c9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2dc8796-8678-4792-8faa-bf616361d8c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-556db6c5-2c53-46da-ac24-523fa4fae7cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-556db6c5-2c53-46da-ac24-523fa4fae7cd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-556db6c5-2c53-46da-ac24-523fa4fae7cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbaac2a1-9b1f-4b1e-9049-b446cd488125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbaac2a1-9b1f-4b1e-9049-b446cd488125
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbaac2a1-9b1f-4b1e-9049-b446cd488125
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-15268d38-f23c-4266-a34c-817958885792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15268d38-f23c-4266-a34c-817958885792
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-15268d38-f23c-4266-a34c-817958885792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3b701a0-576f-456c-8479-783c2260fb3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b701a0-576f-456c-8479-783c2260fb3f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3b701a0-576f-456c-8479-783c2260fb3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b5aa05e-06a6-4dce-9030-90a340f53438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b5aa05e-06a6-4dce-9030-90a340f53438
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b5aa05e-06a6-4dce-9030-90a340f53438
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae2f3f5d-bf6e-4259-bb59-f5152a6cd4ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2f3f5d-bf6e-4259-bb59-f5152a6cd4ad
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae2f3f5d-bf6e-4259-bb59-f5152a6cd4ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-c86cae2b-810c-4d1c-9f6c-6053742c9f68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86cae2b-810c-4d1c-9f6c-6053742c9f68
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c86cae2b-810c-4d1c-9f6c-6053742c9f68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-74cf3b09-1a68-49d0-b3d7-a0ecad3a36f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74cf3b09-1a68-49d0-b3d7-a0ecad3a36f6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-74cf3b09-1a68-49d0-b3d7-a0ecad3a36f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc5738a1-d9d6-42fa-b8a2-a430a5a3e189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc5738a1-d9d6-42fa-b8a2-a430a5a3e189
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc5738a1-d9d6-42fa-b8a2-a430a5a3e189
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-851cf5b8-6da0-4cf8-ad7b-7e0a79d4518f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-851cf5b8-6da0-4cf8-ad7b-7e0a79d4518f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-851cf5b8-6da0-4cf8-ad7b-7e0a79d4518f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-521816bb-8305-4995-b02c-e154263598cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-521816bb-8305-4995-b02c-e154263598cd
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-521816bb-8305-4995-b02c-e154263598cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-6651832f-632c-483e-823c-5c839a128d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6651832f-632c-483e-823c-5c839a128d9b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6651832f-632c-483e-823c-5c839a128d9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-a45fe389-ee60-4a92-94e6-2b715742f0b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a45fe389-ee60-4a92-94e6-2b715742f0b8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a45fe389-ee60-4a92-94e6-2b715742f0b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-76649598-0342-4e7f-8642-d0a5975512e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76649598-0342-4e7f-8642-d0a5975512e7
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-76649598-0342-4e7f-8642-d0a5975512e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f8c10e2-5a61-49f0-9aa8-a6b593f17436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f8c10e2-5a61-49f0-9aa8-a6b593f17436
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f8c10e2-5a61-49f0-9aa8-a6b593f17436
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2db12d7-2175-45de-9055-53d19ffc5758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2db12d7-2175-45de-9055-53d19ffc5758
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2db12d7-2175-45de-9055-53d19ffc5758
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-282d8e02-5bbb-46a5-9875-32943f953cd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-282d8e02-5bbb-46a5-9875-32943f953cd4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-282d8e02-5bbb-46a5-9875-32943f953cd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6db81cf-45d5-4dd0-9ba0-3a4079cf5859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6db81cf-45d5-4dd0-9ba0-3a4079cf5859
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6db81cf-45d5-4dd0-9ba0-3a4079cf5859
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-26ac914d-fb7d-441a-b48f-8e0216618423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ac914d-fb7d-441a-b48f-8e0216618423
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-26ac914d-fb7d-441a-b48f-8e0216618423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-3729ae6e-3517-4210-8513-7251ae023849

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3729ae6e-3517-4210-8513-7251ae023849
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3729ae6e-3517-4210-8513-7251ae023849
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-c39dd066-2266-4c72-951a-61b33f3ff870

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39dd066-2266-4c72-951a-61b33f3ff870
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c39dd066-2266-4c72-951a-61b33f3ff870
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d71bf3f-ac21-40d8-bc56-de87c61e5d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d71bf3f-ac21-40d8-bc56-de87c61e5d38
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d71bf3f-ac21-40d8-bc56-de87c61e5d38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-22541d7a-ce37-4740-af8a-6c22495426c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22541d7a-ce37-4740-af8a-6c22495426c5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-22541d7a-ce37-4740-af8a-6c22495426c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e91c2b9-70e5-49c7-b48c-c6611b52fd74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e91c2b9-70e5-49c7-b48c-c6611b52fd74
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e91c2b9-70e5-49c7-b48c-c6611b52fd74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3e91c2b9-70e5-49c7-b48c-c6611b52fd74"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-719c1fe4-3787-4471-80bc-1c2153091eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719c1fe4-3787-4471-80bc-1c2153091eaa
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-719c1fe4-3787-4471-80bc-1c2153091eaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-719c1fe4-3787-4471-80bc-1c2153091eaa"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0c0551b-4853-423b-9011-915eb278b26c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c0551b-4853-423b-9011-915eb278b26c
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0c0551b-4853-423b-9011-915eb278b26c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a0c0551b-4853-423b-9011-915eb278b26c"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-e837949b-d3c3-4287-bd0a-d154645dc4fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e837949b-d3c3-4287-bd0a-d154645dc4fe
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e837949b-d3c3-4287-bd0a-d154645dc4fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e837949b-d3c3-4287-bd0a-d154645dc4fe"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-c96d6494-43af-4b5f-ab27-2f861e76976d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c96d6494-43af-4b5f-ab27-2f861e76976d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c96d6494-43af-4b5f-ab27-2f861e76976d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c96d6494-43af-4b5f-ab27-2f861e76976d"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7b9b8cb-d53b-4423-8da5-f21700fc3a6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b9b8cb-d53b-4423-8da5-f21700fc3a6f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7b9b8cb-d53b-4423-8da5-f21700fc3a6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c7b9b8cb-d53b-4423-8da5-f21700fc3a6f"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-f87bfdd2-83dc-4c99-9ccf-a4bf3c542810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f87bfdd2-83dc-4c99-9ccf-a4bf3c542810
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f87bfdd2-83dc-4c99-9ccf-a4bf3c542810
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f87bfdd2-83dc-4c99-9ccf-a4bf3c542810"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cb0f22c-d997-44cb-a26b-abb1207c40da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb0f22c-d997-44cb-a26b-abb1207c40da
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cb0f22c-d997-44cb-a26b-abb1207c40da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7cb0f22c-d997-44cb-a26b-abb1207c40da"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-60ea2e81-f056-4300-ab96-00868f816157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ea2e81-f056-4300-ab96-00868f816157
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60ea2e81-f056-4300-ab96-00868f816157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60ea2e81-f056-4300-ab96-00868f816157"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfdb5ce4-22b4-41bf-9e10-3c55a1e822b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfdb5ce4-22b4-41bf-9e10-3c55a1e822b5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfdb5ce4-22b4-41bf-9e10-3c55a1e822b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dfdb5ce4-22b4-41bf-9e10-3c55a1e822b5"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cd43047-37df-420c-8b90-f9c0930c653f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd43047-37df-420c-8b90-f9c0930c653f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cd43047-37df-420c-8b90-f9c0930c653f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9cd43047-37df-420c-8b90-f9c0930c653f"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-af2f4cc5-4695-4438-b36a-b116bd144f00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af2f4cc5-4695-4438-b36a-b116bd144f00
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af2f4cc5-4695-4438-b36a-b116bd144f00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-af2f4cc5-4695-4438-b36a-b116bd144f00"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-64572066-a570-4603-82ea-99140f14ff69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64572066-a570-4603-82ea-99140f14ff69
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64572066-a570-4603-82ea-99140f14ff69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-64572066-a570-4603-82ea-99140f14ff69"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5116d72-19c4-4819-9028-424fc2de1da2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5116d72-19c4-4819-9028-424fc2de1da2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5116d72-19c4-4819-9028-424fc2de1da2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c5116d72-19c4-4819-9028-424fc2de1da2"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-8744bf41-35f7-49e2-826d-e0c5aa9ea8aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8744bf41-35f7-49e2-826d-e0c5aa9ea8aa
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8744bf41-35f7-49e2-826d-e0c5aa9ea8aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8744bf41-35f7-49e2-826d-e0c5aa9ea8aa"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-b55620db-4641-457e-8b6b-c4b0e2a37d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55620db-4641-457e-8b6b-c4b0e2a37d34
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b55620db-4641-457e-8b6b-c4b0e2a37d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b55620db-4641-457e-8b6b-c4b0e2a37d34"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4550498-a44e-4eb6-90c3-92eb7b48a4ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4550498-a44e-4eb6-90c3-92eb7b48a4ce
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4550498-a44e-4eb6-90c3-92eb7b48a4ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e4550498-a44e-4eb6-90c3-92eb7b48a4ce"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec064ae6-a7ab-4161-8f95-9dd799fe75d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec064ae6-a7ab-4161-8f95-9dd799fe75d2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec064ae6-a7ab-4161-8f95-9dd799fe75d2
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
Content-Length: 181

{"id":"acc_49f6ddb6-9223-4a49-b4f1-501fd95d0df8","handle":"qa-432cb5f3aded","displayName":"QA 432cb5f3aded","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.563233830Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d6287e5-f327-4e4c-a730-e412164011b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d6287e5-f327-4e4c-a730-e412164011b5
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d6287e5-f327-4e4c-a730-e412164011b5
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

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-ebd3176b-c384-4321-bbb2-65ae51f7976e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebd3176b-c384-4321-bbb2-65ae51f7976e
Content-Type: application/json

--- request body ---
{"handle":"qa-432cb5f3aded","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebd3176b-c384-4321-bbb2-65ae51f7976e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebd3176b-c384-4321-bbb2-65ae51f7976e"}
```
